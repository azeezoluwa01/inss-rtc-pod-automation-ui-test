package steps;

import gov.uk.inss.base.BasePage;
import gov.uk.inss.environments.EnvironmentManager;
import gov.uk.inss.webdriver.BrowserManager;
import gov.uk.inss.webdriver.DriverPath;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BasePage {

    public void initialisation() {
        driverPath = new DriverPath();
        driverPath.setDriverPath();
        browserManager = new BrowserManager();
        browserManager.getBrowserType();
        environmentManager = new EnvironmentManager();
        environmentManager.getEnvironment();
    }

    @Before
    public void setUp() {
        initialisation();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
