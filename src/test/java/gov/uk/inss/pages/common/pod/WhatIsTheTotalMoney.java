package gov.uk.inss.pages.common.pod;

import gov.uk.inss.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WhatIsTheTotalMoney extends BasePage {

    public WhatIsTheTotalMoney(){
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @CacheLookup
    @FindBy(how = How.ID, using = "VAT")
    private WebElement enterAmountInPounds;

    @CacheLookup
    @FindBy(how = How.ID, using = "sterling")
    private WebElement debtNotInPounds;

    @CacheLookup
    @FindBy(how = How.ID, using = "debt")
    private WebElement enterAmountInOtherCurrency;

    @CacheLookup
    @FindBy(how = How.ID, using = "debt")
    private WebElement continueButton;


    public void enterAmountInPounds(){
        enterAmountInPounds.sendKeys(properties.getProperty("amountOwed"));
    }

    public void clickDebtNotInPounds(){
        debtNotInPounds.click();
    }

    public void enterAmountInOtherCurrency(){
        wait.until(ExpectedConditions.visibilityOf(enterAmountInOtherCurrency));
        enterAmountInOtherCurrency.sendKeys(properties.getProperty("amountOwed"));
    }

    public void enter(String str){
        driver.findElement(By.id(str));
    }



}
