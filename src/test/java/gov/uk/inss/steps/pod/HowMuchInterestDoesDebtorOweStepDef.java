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
}
