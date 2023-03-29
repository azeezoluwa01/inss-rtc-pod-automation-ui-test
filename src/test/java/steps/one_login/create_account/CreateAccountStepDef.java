package steps.one_login.create_account;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountStepDef {


    @Given("I have access to INSS service")
    public void iHaveAccessToINSSService() {
        System.out.println("Yes I have access");
    }

    @When("I want to create a one login account")
    public void iWantToCreateAOneLoginAccount() {
        System.out.println("Yes I want to create an account");
    }

    @Then("one login account is successful")
    public void OneLoginAccountIsSuccessful() {
        System.out.println("One login account is successful");
//        Assert.assertEquals("rtc", "pod");
    }
}
