package gov.uk.inss.webdriver;

import org.openqa.selenium.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.awaitility.core.ConditionTimeoutException;
//import static org.awaitility.Awaitility.await;
import java.util.List;

public class WebElementFacade implements WebElement {
    protected static final Logger LOGGER = LoggerFactory.getLogger("WebElementFacade.class");
    private WebDriver driver;
    private WebElement element;
    private By locator;
    private List<WebElement> elements;

    public WebElementFacade(WebDriver wd, By by) {
        driver = wd;
        locator = by;
    }

//    public WebElement get() {
//
//    }


    @Override
    public void click() {

    }

    @Override
    public void submit() {

    }

    @Override
    public void sendKeys(CharSequence... keysToSend) {

    }

    @Override
    public void clear() {

    }

    @Override
    public String getTagName() {
        return null;
    }

    @Override
    public String getAttribute(String name) {
        return null;
    }

    @Override
    public boolean isSelected() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public List<WebElement> findElements(By by) {
        return null;
    }

    @Override
    public WebElement findElement(By by) {
        return null;
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }

    @Override
    public Point getLocation() {
        return null;
    }

    @Override
    public Dimension getSize() {
        return null;
    }

    @Override
    public Rectangle getRect() {
        return null;
    }

    @Override
    public String getCssValue(String propertyName) {
        return null;
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
        return null;
    }
}
