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

public class IsAnyDebtSecuredAgainstAnItem extends BasePage {

    public IsAnyDebtSecuredAgainstAnItem(){
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
    }

    @CacheLookup
    @FindBy(how = How.ID, using = "Debts")
    private WebElement yesToDebt;

    @CacheLookup
    @FindBy(how = How.ID, using = "Debts-2")
    private WebElement noToDebt;

    @CacheLookup
    @FindBy(how = How.ID, using = "Goods")
    private WebElement yesToGoods;

    @CacheLookup
    @FindBy(how = How.ID, using = "Goods-2")
    private WebElement noToGoods;

    @CacheLookup
    @FindBy(how = How.TAG_NAME, using = "button")
    private WebElement continueButton;

    public void clickContinueButton(){
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
    }

    public void clickYesToDebt() {
        yesToDebt.click();
    }

    public void clickNoToDebt() {
        noToDebt.click();
    }

    public void clickYesToGoods() {
        yesToGoods.click();
    }

    public void clickNoToGoods() {
        noToGoods.click();
    }

    public void selectWhetherDebtIsOwed(String debt) {
        if (debt.equalsIgnoreCase("yes")) {
            clickYesToDebt();
        } else if (debt.equalsIgnoreCase("no")) {
            clickNoToDebt();
        } else throw new RuntimeException("You must answer yes or no to POD debt owed question");
    }

    public void selectWhetherDebtSecuredOnGoods(String goods) {
        if (goods.equalsIgnoreCase("yes")) {
            clickYesToGoods();
        } else if (goods.equalsIgnoreCase("no")) {
            clickNoToGoods();
        } else throw new RuntimeException("You must answer yes or no to POD debt secured on goods question");
    }
}
