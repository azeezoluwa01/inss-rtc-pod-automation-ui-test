package steps;

import gov.uk.inss.base.BasePage;
import gov.uk.inss.environments.EnvironmentManager;
import gov.uk.inss.helper.HelperClass;
import gov.uk.inss.webdriver.BrowserManager;
import gov.uk.inss.webdriver.DriverPath;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook extends BasePage {

    public void initialisation() {
        driverPath = new DriverPath();
        driverPath.setDriverPath();
        browserManager = new BrowserManager();
        browserManager.getBrowserType();
    }

    public void setUpEnvironment(){
        environmentManager = new EnvironmentManager();
        environmentManager.getEnvironment();
    }

    @Before
    public void setUp() {
        initialisation();
        setUpEnvironment();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image.png", scenario.getName());
        }
        if (driver != null) {
            driver.quit();
        }
    }
//    @After
    public void tearDown2(Scenario scenario){
        if (scenario.isFailed()){

        }
        driver.quit();
    }

}
