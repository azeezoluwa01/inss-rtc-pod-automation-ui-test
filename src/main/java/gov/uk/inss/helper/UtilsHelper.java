package gov.uk.inss.helper;

import gov.uk.inss.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UtilsHelper extends BasePage {

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

    public WebElement clickObject(WebElement element) {
        element.click();
        return element;
    }

    public WebElement enterText(WebElement element, String data) {
        element.sendKeys(data);
        return element;
    }


}
