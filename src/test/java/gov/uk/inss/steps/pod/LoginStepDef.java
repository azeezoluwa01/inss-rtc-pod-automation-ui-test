package gov.uk.inss.steps.pod;

import gov.uk.inss.pages.common.pod.LoginPage;
import io.cucumber.java.en.Given;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();

    @Given("I enter valid login credentials")
    public void i_enter_valid_login_credentials() {
        loginPage.enterLoginCredential();
    }

    @Given("I click a submit button")
    public void i_click_a_submit_button() {
        loginPage.clickSubmit();
    }
}
