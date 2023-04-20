package gov.uk.inss.pages.common.pod;

import gov.uk.inss.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BasePage {

    //Get information about an insolvent person or company
    //Before you start
    public LandingPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(how = How.CLASS_NAME, using = "govuk-button")
    public WebElement startNow;

    @CacheLookup
    @FindBy(how = How.CLASS_NAME, using = "govuk-heading-l")
    public WebElement header;

    public void clickStartNowButton() {
        startNow.click();
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public String getPageHeader(){
        return header.getText();
    }


}
