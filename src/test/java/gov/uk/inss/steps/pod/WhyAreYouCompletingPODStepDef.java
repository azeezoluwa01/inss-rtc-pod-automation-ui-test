package gov.uk.inss.steps.pod;

import gov.uk.inss.helper.UtilsHelper;
import gov.uk.inss.pages.common.pod.WhyAreYouCompletingPOD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WhyAreYouCompletingPODStepDef {
    WhyAreYouCompletingPOD whyAreYouCompletingPOD = new WhyAreYouCompletingPOD();
    UtilsHelper utilsHelper = new UtilsHelper();

//    final String pageHeader = "Why are you completing a proof of debt?";

    @When("I click continue button")
    public void iClickContinueButton() {
        whyAreYouCompletingPOD.clickContinueButton();
    }

    @When("I click continue button on screen")
    public void iClickContinueButton2() {
        whyAreYouCompletingPOD.clickContinueButton2();
    }

    @Then("I should see {string}")
    public void i_should_see(String expectedErrorMessage) {
        Assert.assertEquals(expectedErrorMessage, whyAreYouCompletingPOD.getErrorValidation());
    }


}
