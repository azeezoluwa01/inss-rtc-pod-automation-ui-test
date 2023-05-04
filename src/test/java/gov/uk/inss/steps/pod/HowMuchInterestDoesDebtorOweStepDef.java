package gov.uk.inss.steps.pod;

import gov.uk.inss.pages.common.base.CommonBasePage;
import gov.uk.inss.pages.common.pod.HowMuchInterestDoesDebtorOwe;
import io.cucumber.java.en.When;

public class HowMuchInterestDoesDebtorOweStepDef {
    HowMuchInterestDoesDebtorOwe howMuchInterestDoesDebtorOwe = new HowMuchInterestDoesDebtorOwe();

    @When("I am on {string} screen2")
    public void i_am_on_screen2(String expectedHeader) {
        CommonBasePage.verifyHeader(expectedHeader, howMuchInterestDoesDebtorOwe.getPageHeader());
    }

    @When("I enter amount owed in pounds on interest")
    public void iEnterAmountOwedInPoundsOnInterest() {
        howMuchInterestDoesDebtorOwe.enterAmountInPounds();
    }

    @When("I click continue button on how much debtor owe page")
    public void i_click_continue_button_on_how_much_debtor_owe_page() {
        howMuchInterestDoesDebtorOwe.clickContinueButton();
    }
}
