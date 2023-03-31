package gov.uk.inss.helper;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HelperClass {
    private static HelperClass helperClass;
    private static WebDriver driver;
    private static final int TIMEOUT = 10;

    private HelperClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
    }

    private static WebDriver getDriver() {
        return driver;
    }

    public static void openPage(String url) {
        driver.get(url);
    }

    public static void setUpDriver() {
        if (helperClass == null) {
            helperClass = new HelperClass();
        }
    }

    @Before
    public static void setUp() {
        HelperClass.setUpDriver();
    }

    @After
    public static void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot)HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }

}
