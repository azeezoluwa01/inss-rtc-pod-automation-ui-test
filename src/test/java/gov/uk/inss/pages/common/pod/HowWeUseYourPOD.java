package gov.uk.inss.pages.common.pod;

import gov.uk.inss.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HowWeUseYourPOD extends BasePage {

    public HowWeUseYourPOD(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(how = How.CLASS_NAME, using = "govuk-button")
    public WebElement continueButton;

    public void clickContinueButton(){
        continueButton.click();
    }


}
