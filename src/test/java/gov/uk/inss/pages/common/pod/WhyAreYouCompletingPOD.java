package gov.uk.inss.pages.common.pod;

import gov.uk.inss.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WhyAreYouCompletingPOD extends BasePage {

    public final String pageHeader = "Why are you completing a proof of debt?";

    public WhyAreYouCompletingPOD() {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
    }

    @CacheLookup
    @FindBy(how = How.CLASS_NAME, using = "govuk-fieldset__heading")
    private WebElement header;

    @CacheLookup
    @FindBy(how = How.CLASS_NAME, using = "govuk-button")
    private WebElement continueButton;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Continue')]")
    private WebElement continueButton2;

    @CacheLookup
    @FindBy(how = How.TAG_NAME, using = "li")
    private WebElement errorMessage;

    public String getHeader(){
        return header.getText();
    }

    public void verifyPageHeader(){
        Assert.assertEquals(pageHeader, getHeader());
    }

    public void clickContinueButton(){
        wait.until(ExpectedConditions.visibilityOf(continueButton));
        continueButton.click();
    }

    public void clickContinueButton2(){
        wait.until(ExpectedConditions.visibilityOf(continueButton2));
        continueButton2.click();
    }

    public String getErrorValidation(){
        return errorMessage.getText();
    }

}
