package gov.uk.inss.pages.common.pod;

import gov.uk.inss.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HowWeUseYourPOD extends BasePage {

    public HowWeUseYourPOD(){
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @CacheLookup
    @FindBy(how = How.CLASS_NAME, using = "govuk-button")
    private WebElement continueButton;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Continue')]")
    private WebElement continueButton2;

    public void clickContinueButton(){
        continueButton.click();
    }

    public void clickContinueButton2(){
        continueButton2.click();
    }


}
