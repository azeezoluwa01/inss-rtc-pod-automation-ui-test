package gov.uk.inss.pages.common.pod;

import gov.uk.inss.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WhyAreYouCompletingPOD extends BasePage {

    public final String pageHeader = "Why are you completing a proof of debt?";

    public WhyAreYouCompletingPOD() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(how = How.CLASS_NAME, using = "govuk-fieldset__heading")
    public WebElement header;

    @CacheLookup
    @FindBy(how = How.CLASS_NAME, using = "govuk-button")
    public WebElement continueButton;

    @CacheLookup
    @FindBy(how = How.TAG_NAME, using = "li")
    public WebElement errorMessage;

    public String getHeader(){
        return header.getText();
    }

    public void verifyPageHeader(){
        Assert.assertEquals(pageHeader, getHeader());
    }

    public void clickContinueButton(){
        continueButton.click();
    }

    public String getErrorValidation(){
        return errorMessage.getText();
    }

}
