package gov.uk.inss.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"@target/failedscenarios.txt"},
        glue = "steps",
        tags = "@Regression1",
        plugin = {"pretty",
                "json:target/cucumber.json"}
)
public class FailedTestsRunner {
}
