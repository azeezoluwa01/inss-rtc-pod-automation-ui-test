package gov.uk.inss.steps;

import gov.uk.inss.base.BasePage;
import gov.uk.inss.environments.EnvironmentManager;
import gov.uk.inss.helper.UtilsHelper;
import gov.uk.inss.webdriver.BrowserManager;
import gov.uk.inss.webdriver.DriverPath;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.IOException;

public class Hook extends BasePage {

    public void initialisation() {
        driverPath = new DriverPath();
        driverPath.setDriverPath();
        browserManager = new BrowserManager();
        browserManager.getBrowserType();
    }

    public void setUpEnvironment() {
        environmentManager = new EnvironmentManager();
        environmentManager.getEnvironment();
        utilsHelper = new UtilsHelper();
        utilsHelper.waitForPageLoad();
    }

    @Before
    public void setUp() {
        initialisation();
        setUpEnvironment();
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            utilsHelper = new UtilsHelper();
            utilsHelper.takeScreenshotsOfPage(scenario);
        }
        if (driver != null) {
            browserManager.endLocalBrowserProcessesInTaskManager();
            driver.quit();
        }

    }

    //Set retry count argument
//    @Rule
//    public RetryRule retryRule = new RetryRule(3);


}
