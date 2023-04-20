package gov.uk.inss.hook;

import gov.uk.inss.base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.IOException;

public class Hook extends BasePage {
    Hook hook = new Hook();
    @Before
    public void setUp() throws IOException {
        System.out.println("run first");
        hook.setUp();
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        hook.tearDown(scenario);
    }
}