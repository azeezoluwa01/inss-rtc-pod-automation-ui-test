package gov.uk.inss.steps.pod;

import gov.uk.inss.pages.common.pod.Dashboard;
import io.cucumber.java.en.Given;

public class DashboardStepDef {

    Dashboard dashboard = new Dashboard();

    @Given("I click start button on Dashboard")
    public void i_click_start_button_on_dashboard() {
        dashboard.clickStart();
    }

}
