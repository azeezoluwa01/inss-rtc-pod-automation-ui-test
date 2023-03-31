package gov.uk.inss.pages.one_login.home;

<<<<<<< HEAD
import gov.uk.inss.base.BasePage;
=======
<<<<<<< HEAD
>>>>>>> master
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class GovUKHomePage extends BasePage {
//    WebDriver driver;

//    public GovUKHomePage(WebDriver driver) {
//        this.driver = driver;
//        if (!driver.getTitle().equals("GOV Home Page")){
//            throw new IllegalStateException("This is not the GOV Home Page" + "current page is: " + driver.getCurrentUrl());
//        }
//    }

    public GovUKHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        if (!driver.getTitle().equals("GOV Home Page")){
            throw new IllegalStateException("This is not the GOV Home Page" + "current page is: " + driver.getCurrentUrl());
        }
    }

    public GovUKHomePage manageProfile(){
        //Page encapsulation to manage profile functionality
        return new GovUKHomePage(driver);
    }

    @FindBy(how = How.XPATH, using = "locator here")
    @CacheLookup
    private WebElement webElement;

    private By element1 = By.name("");
    private By element2 = By.name("");
    private By element3 = By.name("");
    private By element4 = By.name("");

    public boolean isHeaderDisplayed() {
        boolean status = driver.findElement(element1).isDisplayed();
        return status;
    }

=======
public class GovUKHomePage {
>>>>>>> cf6425264699513621c73f4a89a16d2eb52837ac
}
