package gov.uk.inss.base;

import gov.uk.inss.config.ConfigFileReader;
import gov.uk.inss.environments.EnvironmentManager;
import gov.uk.inss.webdriver.BrowserManager;
import gov.uk.inss.webdriver.DriverPath;
import org.openqa.selenium.WebDriver;

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
    public String qa_env = properties.getProperty("qa_env");
    public String dev_env = properties.getProperty("dev_env");
    public String preprod_env = properties.getProperty("preprod_env");

    public WebDriver getDriver() {
        return driver;
    }
}