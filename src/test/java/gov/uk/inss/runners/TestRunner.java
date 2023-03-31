package gov.uk.inss.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = "steps",
        tags = "@Regression",
        plugin = {"pretty",
                "json:target/RTC_POD-ui-reports/cucumber.json",
                "rerun:target/failedscenarios.txt"},
        monochrome = true

)
public class TestRunner {
}
