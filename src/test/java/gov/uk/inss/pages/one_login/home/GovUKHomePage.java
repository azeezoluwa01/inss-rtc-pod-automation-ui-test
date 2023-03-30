package gov.uk.inss.pages.one_login.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GovUKHomePage {
    WebDriver driver;

    public GovUKHomePage(WebDriver driver) {
        this.driver = driver;
    }

    By element1 = By.name("");
    By element2 = By.name("");
    By element3 = By.name("");
    By element4 = By.name("");

    public boolean isHeaderDisplayed() {
        boolean status = driver.findElement(element1).isDisplayed();
        return status;
    }

}
