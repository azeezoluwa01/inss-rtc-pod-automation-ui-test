package steps;

import gov.uk.inss.base.BasePage;
import gov.uk.inss.environments.EnvironmentManager;
import gov.uk.inss.helper.UtilsHelper;
import gov.uk.inss.runners.RetryRule;
import gov.uk.inss.webdriver.BrowserManager;
import gov.uk.inss.webdriver.DriverPath;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    public void setUp() throws IOException {
        initialisation();
        setUpEnvironment();
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            takeScreenshotsOfPage(scenario);
        }
        if (driver != null) {
            browserManager.endLocalBrowserProcessesInTaskManager();
            driver.quit();
        }

    }

    public void takeScreenshotsOfPage(Scenario scenario) {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            Date date;
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
            date = new Date();
            FileUtils.copyFile(source, new File(String.format("src/test/resources/screenshots/" + scenario.getStatus() + " " + scenario.getName() + " " + dateFormat.format(date) + ".png")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Set retry count argument
    @Rule
    public RetryRule retryRule = new RetryRule(3);

}
