package gov.uk.inss.base;

import gov.uk.inss.config.ConfigFileReader;
import gov.uk.inss.environments.EnvironmentManager;
<<<<<<< HEAD
import gov.uk.inss.webdriver.BrowserManager;
import gov.uk.inss.webdriver.DriverPath;
import org.openqa.selenium.WebDriver;
=======
import gov.uk.inss.webdriver.BrowserEnum;
import gov.uk.inss.webdriver.BrowserManager;
import gov.uk.inss.webdriver.DriverPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;
>>>>>>> cf6425264699513621c73f4a89a16d2eb52837ac

public class BasePage extends ConfigFileReader {
    public static WebDriver driver;
    public BrowserManager browserManager;
    public DriverPath driverPath;
    public EnvironmentManager environmentManager;
    public String browserName = properties.getProperty("BROWSER_NAME");
    public String chromeDriverPath = "src/main/java/gov/uk/inss/drivers/chromedriver.exe";
    public String firefoxDriverPath = "src/main/java/gov/uk/inss/drivers/geckodriver.exe";
    public String edgeDriverPath = "src/main/java/gov/uk/inss/drivers/msedgedriver.exe";
    public String chromeDriverProperty = "webdriver.chrome.driver";
    public String firefoxDriverProperty = "webdriver.gecko.driver";
    public String edgeDriverProperty = "webdriver.edge.driver";
<<<<<<< HEAD
    public String qa_env = properties.getProperty("qa_env");
    public String dev_env = properties.getProperty("dev_env");
    public String preprod_env = properties.getProperty("preprod_env");

    public WebDriver getDriver() {
        return driver;
    }
=======
    public String qa_env = "https://www.bbc.co.uk";
    public String dev_env = "https://www.facebook.com";
    public String preprod_env = "https://www.sky.com";


>>>>>>> cf6425264699513621c73f4a89a16d2eb52837ac
}
