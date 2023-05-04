package gov.uk.inss.steps.pod;

import gov.uk.inss.pages.common.base.CommonBasePage;
import gov.uk.inss.pages.common.pod.DoesThisPersonOweAnyInterest;
import io.cucumber.java.en.When;

public class DoesThisPersonOweAnyInterestStepDef {

    DoesThisPersonOweAnyInterest doesThisPersonOweAnyInterest = new DoesThisPersonOweAnyInterest();
    @When("I click {string} on interest owed")
    public void i_click_on_interest_owed(String expectedAnswer) {
        doesThisPersonOweAnyInterest.selectWhetherInterestIsOwed(expectedAnswer);
    }

    @When("I click continue button on does debtor owe interest page")
    public void i_click_continue_button_on_does_debtor_owe_interest_page() {
        doesThisPersonOweAnyInterest.clickContinueButton();
    }

//    @When("I am on {string}")
//    public void i_am_on(String expectedHeader) {
//        CommonBasePage.verifyHeader(expectedHeader, doesThisPersonOweAnyInterest.getPageHeader3());
//    }


}
