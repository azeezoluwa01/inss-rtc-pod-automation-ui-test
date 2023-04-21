package gov.uk.inss.steps.pod;

import gov.uk.inss.pages.common.pod.WhyAreYouCompletingPOD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WhyAreYouCompletingPODStepDef {
    WhyAreYouCompletingPOD whyAreYouCompletingPOD = new WhyAreYouCompletingPOD();

//    final String pageHeader = "Why are you completing a proof of debt?";

    @When("I click continue button")
    public void iClickContinueButton() {
        whyAreYouCompletingPOD.clickContinueButton();
    }

    @Then("I should see {string}")
    public void i_should_see(String expectedErrorMessage) {
        Assert.assertEquals(expectedErrorMessage, whyAreYouCompletingPOD.getErrorValidation());
    }


}
