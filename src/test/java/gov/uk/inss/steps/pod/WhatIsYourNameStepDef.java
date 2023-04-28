package gov.uk.inss.steps.pod;

import gov.uk.inss.pages.common.pod.WhatIsYourName;
import io.cucumber.java.en.Given;

public class WhatIsYourNameStepDef {

    WhatIsYourName whatIsYourName = new WhatIsYourName();

    @Given("I enter {string} and {string} names")
    public void i_enter_and_names(String firsName, String lastName) {
        whatIsYourName.enterFullName(firsName, lastName);
    }

    @Given("I click continue button on names page")
    public void i_click_continue_button_on_names_page() {
        whatIsYourName.clickContinueButton();
    }
}
