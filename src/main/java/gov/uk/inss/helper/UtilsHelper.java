package gov.uk.inss.helper;

import gov.uk.inss.base.BasePage;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class UtilsHelper extends BasePage {
    protected static final Logger LOGGER = LoggerFactory.getLogger("UtilsHelper.class");
    public static final long DEFAULT_WAIT_TIMEOUT = 10l;
    public WebElement getWebElement(String locatorType, String locatorValue) {

        switch (locatorType) {
            case "XPATH":
                return driver.findElement(By.xpath(locatorValue));
            case "CSS":
                return driver.findElement(By.cssSelector(locatorValue));
            case "ID":
                return driver.findElement(By.id(locatorValue));
            case "NAME":
                return driver.findElement(By.name(locatorValue));
            case "TAGNAME":
                return driver.findElement(By.tagName(locatorValue));
            case "PARTIALLINKTEXT":
                return driver.findElement(By.partialLinkText(locatorValue));
            case "CLASSNAME":
                return driver.findElement(By.className(locatorValue));
            default:
                return null;
        }
    }

    public List<WebElement> getWebElements(String locatorType, String locatorValue) {

        switch (locatorType) {
            case "XPATH":
                return driver.findElements(By.xpath(locatorValue));
            case "CSS":
                return driver.findElements(By.cssSelector(locatorValue));
            case "ID":
                return driver.findElements(By.id(locatorValue));
            case "NAME":
                return driver.findElements(By.name(locatorValue));
            case "TAGNAME":
                return driver.findElements(By.tagName(locatorValue));
            case "PARTIALLINKTEXT":
                return driver.findElements(By.partialLinkText(locatorValue));
            case "CLASSNAME":
                return driver.findElements(By.className(locatorValue));
            default:
                return null;
        }
    }

    public void scrollDownMiddleOfPage() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0, 250", "");
    }

    public void scrollUpMiddleOfPage() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0, -250", "");
    }

    public void scrollDownBottomOfPage() {
        try {
            long lastPageHeight = (long) ((JavascriptExecutor) driver)
                    .executeScript("return document.body.scrollHeight");
            while (true) {
                ((JavascriptExecutor) driver)
                        .executeScript("window.scrollTo(0, document.body.scrollHeight);");

                waitForPageLoad();

                long newPageHeight = (long) ((JavascriptExecutor) driver)
                        .executeScript("return document.body.scrollHeight");
                if (newPageHeight == lastPageHeight) {
                    break;
                }
                lastPageHeight = newPageHeight;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void scrollUpPage(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0, document.body.scrollHeight);");
    }

    public void scrollToElement(WebElement viewOfThisElement){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", viewOfThisElement);
    }
    public boolean waitForElementToBeInvisible(WebElement element){
        return waitForElementToBeInvisible(element, DEFAULT_WAIT_TIMEOUT);
    }

    public boolean waitForElementToBeInvisible(WebElement element, long timeOutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
        return wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void waitForPageLoad(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT_TIMEOUT));
        ExpectedCondition<Boolean> pageLoadCondition = driver -> {
            assert driver != null;
            return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
        };
        wait.until(pageLoadCondition);
    }

    public void waitForPageLoad2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT_TIMEOUT));
        ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver){
                return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
            }
        };
        wait.until(pageLoadCondition);
    }

    public WebElement clickObject(WebElement element) {
        element.click();
        return element;
    }

    public WebElement enterText(WebElement element, String data) {
        element.sendKeys(data);
        return element;
    }

    public void takeScreenshotsOfPage(Scenario scenario) {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            Date date;
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
            date = new Date();
            FileUtils.copyFile(source, new File(String.format("src/test/resources/screenshots/" + scenario.getStatus() + " " + scenario.getName() + " " + dateFormat.format(date) + ".png")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
