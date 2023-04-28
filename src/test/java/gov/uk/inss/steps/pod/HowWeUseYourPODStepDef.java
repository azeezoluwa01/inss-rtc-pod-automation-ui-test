package gov.uk.inss.steps.pod;

import gov.uk.inss.pages.common.pod.HowWeUseYourPOD;
import io.cucumber.java.en.Given;

public class HowWeUseYourPODStepDef {

    HowWeUseYourPOD howWeUseYourPOD = new HowWeUseYourPOD();

    @Given("I click continue button on how we use your pod")
    public void i_click_continue_button_on_how_we_use_your_pod() {
        howWeUseYourPOD.clickContinueButton2();
    }
}
