package gov.uk.inss.steps.pod;

import gov.uk.inss.pages.common.pod.IsAnyDebtSecuredAgainstAnItem;
import io.cucumber.java.en.When;

public class IsAnyDebtSecuredAgainstAnItemStepDef {

    IsAnyDebtSecuredAgainstAnItem isAnyDebtSecuredAgainstAnItem = new IsAnyDebtSecuredAgainstAnItem();

    @When("I click {string} on debt owed")
    public void i_click_on_debt_owed(String debt) {
        isAnyDebtSecuredAgainstAnItem.selectWhetherDebtIsOwed(debt);
    }

    @When("I click {string} to secured goods")
    public void i_click_to_secured_goods(String goods) {
        isAnyDebtSecuredAgainstAnItem.selectWhetherDebtSecuredOnGoods(goods);
    }

    @When("I click continue button on secure debt screen")
    public void i_click_continue_button_on_secure_debt_screen() {
        isAnyDebtSecuredAgainstAnItem.clickContinueButton();
    }



}
