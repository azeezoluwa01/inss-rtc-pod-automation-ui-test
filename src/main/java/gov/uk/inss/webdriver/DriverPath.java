package gov.uk.inss.webdriver;

import gov.uk.inss.base.BasePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverPath extends BasePage {
protected static final Logger LOGGER = LoggerFactory.getLogger("DriverPath.class");
    public void setDriverPath() {
        BrowserEnum browserEnum = BrowserEnum.valueOf(browserName.toUpperCase());
        switch (browserEnum) {
            case CHROME:
                System.setProperty(chromeDriverProperty, chromeDriverPath);
                break;
            case EDGE:
                System.setProperty(edgeDriverProperty, edgeDriverPath);
                break;
            case FIREFOX:
                System.setProperty(firefoxDriverProperty, firefoxDriverPath);
                break;
            default:
                LOGGER.error("No driver path found!");
                break;
        }
    }
}
