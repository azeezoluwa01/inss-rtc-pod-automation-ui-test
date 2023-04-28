package gov.uk.inss.pages.common.pod;

import gov.uk.inss.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {

    public LoginPage(){
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//input[@id='Name']")
    private WebElement email;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    private WebElement password;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit')]")
    private WebElement submit;

    public void enterLoginCredential(){
        email.sendKeys("test");
        password.sendKeys("test");
    }

    public void clickSubmit(){
        submit.click();
    }
}
