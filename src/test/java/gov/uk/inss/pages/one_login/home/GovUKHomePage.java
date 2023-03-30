package gov.uk.inss.pages.one_login.home;

<<<<<<< HEAD
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

=======
public class GovUKHomePage {
>>>>>>> cf6425264699513621c73f4a89a16d2eb52837ac
}
