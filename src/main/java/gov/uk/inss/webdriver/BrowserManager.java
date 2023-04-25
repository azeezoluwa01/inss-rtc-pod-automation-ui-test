package gov.uk.inss.webdriver;

import gov.uk.inss.base.BasePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.time.Duration;

public class BrowserManager extends BasePage {
    private static final int TIMEOUT = 10;
    protected static final Logger LOGGER = LoggerFactory.getLogger("BrowserManager.class");
    public ChromeOptions chromeOptions;
    BrowserEnum browserEnum = BrowserEnum.valueOf(browserName.toUpperCase());

    public void getBrowserType() {
        BrowserManager chromeBrowserOption = new BrowserManager();
        BrowserManager edgeBrowserOption = new BrowserManager();
        BrowserManager firefoxBrowserOption = new BrowserManager();

        switch (browserEnum) {
            case CHROME:
                driver = new ChromeDriver(chromeBrowserOption.setChromeOptions());
                break;
            case EDGE:
                driver = new EdgeDriver(edgeBrowserOption.setEdgeOptions());
                break;
            case FIREFOX:
                driver = new FirefoxDriver(firefoxBrowserOption.setFirefoxOptions());
                break;
            default:
                LOGGER.error("No browser found!");
                break;
        }
        implicitlyWait();
    }

    public void implicitlyWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
    }

    public ChromeOptions setChromeOptions() {
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("ignore-certificate-errors");
        chromeOptions.setHeadless(false);
        return chromeOptions;
    }

    public EdgeOptions setEdgeOptions() {
        EdgeOptions edgeOptions = new EdgeOptions();
//        edgeOptions.addArguments("start-maximized");
//        edgeOptions.addArguments("ignore-certificate-errors");
        edgeOptions.setHeadless(false);
        return edgeOptions;
    }

    public FirefoxOptions setFirefoxOptions() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
//        firefoxOptions.addArguments("ignore-certificate-errors");
        firefoxOptions.setHeadless(false);
        return firefoxOptions;
    }

    public void endLocalBrowserProcessesInTaskManager() throws IOException {
        switch (browserEnum) {
            case CHROME:
                runtime = Runtime.getRuntime();
                process = runtime.exec("taskkill /F /IM chromedriver.exe");
                process.destroy();
                break;
            case EDGE:
                runtime = Runtime.getRuntime();
                process = runtime.exec("taskkill /F /IM msedgedriver.exe");
                process.destroy();
                break;
            case FIREFOX:
                runtime = Runtime.getRuntime();
                process = runtime.exec("taskkill /F /IM geckodriver.exe");
                process.destroy();
                break;
            default:
                LOGGER.info("To kill off browser driver executable");
                break;
        }
    }

}
