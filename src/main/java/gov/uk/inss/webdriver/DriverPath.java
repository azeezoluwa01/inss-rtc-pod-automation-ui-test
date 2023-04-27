package gov.uk.inss.webdriver;

import gov.uk.inss.base.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverPath extends BasePage {
protected static final Logger LOGGER = LoggerFactory.getLogger("DriverPath.class");
    public void setDriverPath() {
        BrowserEnum browserEnum = BrowserEnum.valueOf(browserName.toUpperCase());
        switch (browserEnum) {
            case CHROME:
//                System.setProperty(chromeDriverProperty, chromeDriverPath);
                WebDriverManager.chromedriver().setup();
                break;
            case EDGE:
                System.setProperty(edgeDriverProperty, edgeDriverPath);
//                WebDriverManager.edgedriver().setup();
                break;
            case FIREFOX:
                System.setProperty(firefoxDriverProperty, firefoxDriverPath);
//                WebDriverManager.firefoxdriver().setup();
                break;
            case SAFARI:
//                System.setProperty();
                WebDriverManager.safaridriver().setup();
            default:
                LOGGER.error("No driver path found!");
                break;
        }
    }
}
