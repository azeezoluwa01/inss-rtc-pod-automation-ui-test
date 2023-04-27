package gov.uk.inss.steps.one_login.create_account;

import gov.uk.inss.pages.common.pod.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateAccountStepDef {


    @When("I want to create a one login account")
    public void iWantToCreateAOneLoginAccount() {
        System.out.println("Yes I want to create an account");
    }

    @Then("one login account is successful")
    public void OneLoginAccountIsSuccessful() {
        System.out.println("One login account is successful");
    }
}
