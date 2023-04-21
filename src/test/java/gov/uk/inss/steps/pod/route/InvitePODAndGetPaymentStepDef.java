package gov.uk.inss.steps.pod.route;

import gov.uk.inss.pages.common.pod.WhyAreYouCompletingPOD;
import gov.uk.inss.pages.pod.invite_pod.InvitePODAndGetPayment;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class InvitePODAndGetPaymentStepDef {

    InvitePODAndGetPayment invitePODAndGetPayment = new InvitePODAndGetPayment();
    WhyAreYouCompletingPOD whyAreYouCompletingPOD = new WhyAreYouCompletingPOD();
    @When("I have received a letter telling me to complete one so that I can get a dividend payment")
    public void iHaveReceivedLetterToCompletePOD() {
        whyAreYouCompletingPOD.verifyPageHeader();
        invitePODAndGetPayment.clickInvitePOD();
        whyAreYouCompletingPOD.clickContinueButton();
    }
}
