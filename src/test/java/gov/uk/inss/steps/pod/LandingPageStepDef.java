package gov.uk.inss.steps.pod;

import gov.uk.inss.pages.common.base.CommonBasePage;
import gov.uk.inss.pages.common.pod.HowWeUseYourPOD;
import gov.uk.inss.pages.common.pod.LandingPage;
import io.cucumber.java.en.Given;

public class LandingPageStepDef {
    LandingPage landingPage = new LandingPage();
    HowWeUseYourPOD howWeUseYourPOD = new HowWeUseYourPOD();
    final String pageHeader = "Get information about an insolvent person or company";
    final String titleName = "GOV.UK - The best place to find government services and information";

    final String screenName = "How we use your proof of debt";

    @Given("I am on POD landing page")
    public void iAmOnPODLandingPage() {
        CommonBasePage.verifyHeader(pageHeader, landingPage.getPageHeader());
        CommonBasePage.verifyTitle(titleName, landingPage.getPageTitle());
    }

    @Given("I click start now button")
    public void i_click_start_now_button() {
        landingPage.clickStartNowButton();
    }

    @Given("I want to complete a POD")
    public void iWantToCompletePOD() {
//        landingPage.clickStartNowButton();
        howWeUseYourPOD.clickContinueButton();
    }



}
