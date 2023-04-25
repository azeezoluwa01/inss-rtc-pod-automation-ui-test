package gov.uk.inss.pages.common.pod;

import gov.uk.inss.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage extends BasePage {

    //Get information about an insolvent person or company
    //Before you start
    public LandingPage() {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
    }

    @CacheLookup
    @FindBy(how = How.CLASS_NAME, using = "govuk-button")
    private WebElement startNow;

    @CacheLookup
    @FindBy(how = How.CLASS_NAME, using = "govuk-heading-l")
    private WebElement header;

    @CacheLookup
    @FindBy(how = How.CLASS_NAME, using = "govuk-fieldset__heading")
    private WebElement header2;

//    @CacheLookup
//    @FindBy(how = How.CLASS_NAME, using = "govuk-label govuk-label--l")
//    public WebElement header3;

    public void clickStartNowButton() {
        startNow.click();
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public String getPageHeader(){
        return header.getText();
    }

    public String getPageHeader2() throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(header2));
        return header2.getText();
    }

//    public String getPageHeader3(){
//        return header3.getText();
//    }


}
