package gov.uk.inss.steps.pod;

import gov.uk.inss.pages.common.pod.RegistrationCodes;
import io.cucumber.java.en.Given;

public class RegistrationCodesStepDef {

    RegistrationCodes registrationCodes = new RegistrationCodes();

    @Given("I enter registration codes")
    public void i_enter_registration_codes() {
        registrationCodes.enterRegistrationCodes();
    }


}
