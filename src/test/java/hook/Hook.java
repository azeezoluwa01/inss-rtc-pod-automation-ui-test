package hook;

import gov.uk.inss.base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook extends BasePage {
    steps.Hook hook = new steps.Hook();
    @Before
    public void setUp(Scenario scenario) {
        System.out.println("run first");
        hook.setUp();
    }

    @After
    public void tearDown() {
//        driver.close();
        hook.tearDown();
    }
}
