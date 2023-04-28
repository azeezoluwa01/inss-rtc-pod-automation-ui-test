package gov.uk.inss.pages.common.pod;

import gov.uk.inss.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WhatIsYourName extends BasePage {

    public WhatIsYourName(){
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @CacheLookup
    @FindBy(how = How.ID, using = "UserDetailsForm_FirstName")
    private WebElement firstName;

    @CacheLookup
    @FindBy(how = How.ID, using = "UserDetailsForm_LastName")
    private WebElement lastName;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Continue')]")
    private WebElement continueButton;

    public void enterFullName(String first_name, String last_name){
        firstName.sendKeys(first_name);
        lastName.sendKeys(last_name);
    }

    public void clickContinueButton(){
        continueButton.click();
    }

}
