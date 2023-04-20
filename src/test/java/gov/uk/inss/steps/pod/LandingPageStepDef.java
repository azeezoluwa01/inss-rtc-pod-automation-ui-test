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


    @Given("I am on POD landing page")
    public void iAmOnPODLandingPage() {
        CommonBasePage.verifyHeader(pageHeader, landingPage.getPageHeader());
        CommonBasePage.verifyTitle(titleName, landingPage.getPageTitle());
    }

    @Given("I want to complete a POD")
    public void iWantToCompletePOD() {
        landingPage.clickStartNowButton();
        howWeUseYourPOD.clickContinueButton();
    }


}
