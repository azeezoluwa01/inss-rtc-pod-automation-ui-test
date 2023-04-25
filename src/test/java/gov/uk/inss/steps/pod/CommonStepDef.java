package gov.uk.inss.steps.pod;

import gov.uk.inss.pages.common.base.CommonBasePage;
import gov.uk.inss.pages.common.pod.LandingPage;
import io.cucumber.java.en.When;

public class CommonStepDef {
    LandingPage landingPage = new LandingPage();

    @When("I am on {string} page")
    public void i_am_on_page(String expectedHeader) {
        CommonBasePage.verifyHeader(expectedHeader, landingPage.getPageHeader());
    }

    @When("I am on {string} screen")
    public void i_am_on_screen(String expectedHeader) throws InterruptedException {
        CommonBasePage.verifyHeader(expectedHeader, landingPage.getPageHeader2());
    }

//    @When("I am on {string}")
//    public void i_am_on(String expectedHeader) {
//        CommonBasePage.verifyHeader(expectedHeader, landingPage.getPageHeader3());
//    }
}
