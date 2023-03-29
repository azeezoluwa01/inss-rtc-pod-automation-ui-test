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

public class BrowserManager extends BasePage {
    protected static final Logger LOGGER = LoggerFactory.getLogger("BrowserManager.class");
    public void getBrowserType() {
        BrowserEnum browserEnum = BrowserEnum.valueOf(browserName.toUpperCase());
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
    }

    public ChromeOptions setChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.setHeadless(false);

        return chromeOptions;
    }

    public EdgeOptions setEdgeOptions() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("start-maximized");
        edgeOptions.setHeadless(false);
        return edgeOptions;
    }

    public FirefoxOptions setFirefoxOptions() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
//        firefoxOptions.addArguments("start-maximized");
        firefoxOptions.setHeadless(false);
        return firefoxOptions;
    }

}
