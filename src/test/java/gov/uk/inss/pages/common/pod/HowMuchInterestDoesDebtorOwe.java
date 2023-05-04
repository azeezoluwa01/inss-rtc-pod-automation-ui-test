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

public class HowMuchInterestDoesDebtorOwe extends BasePage {

    public HowMuchInterestDoesDebtorOwe(){
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//label[contains(text(),'How much interest does debtor owe?')]")
    private WebElement pageHeader;

    @CacheLookup
    @FindBy(how = How.ID, using = "Interest")
    private WebElement enterAmountInPounds;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Continue')]")
    private WebElement continueButton;

    public String getPageHeader() {
        wait.until(ExpectedConditions.visibilityOf(pageHeader));
        return pageHeader.getText();
    }

    public void enterAmountInPounds(){
        enterAmountInPounds.sendKeys(properties.getProperty("amountOwed"));
    }

    public void clickContinueButton(){
        continueButton.click();
    }

}
