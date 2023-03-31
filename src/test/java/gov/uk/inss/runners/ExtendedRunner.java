package gov.uk.inss.runners;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedTestNGRunner;
import com.github.mkolisnyk.cucumber.runner.RetryAcceptance;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//WORK IN PROGRESS...
@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
        jsonReport = "target/cucumber.json",
        retryCount = 3,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        coverageReport = true,
        jsonUsageReport = "target/cucumber-usage.json",
        usageReport = true,
        toPDF = true,
        includeCoverageTags = {"@Regression1"},
        outputFolder = "target"
)

@CucumberOptions(
        features = {"classpath:features"},
        glue = "steps",
        tags = "@Regression1",
        plugin = {"pretty",
                "json:target/RTC_POD-ui-reports/cucumber.json",
                "json:target/cucumber.json",
                "usage:target/cucumber-usage.json",
                "junit:target/cucumber-results.xml",
                "rerun:target/failedscenarios.txt"}
)

public class ExtendedRunner extends ExtendedTestNGRunner {

    public static int retries = 0;

    public ExtendedRunner() {
    }

    @RetryAcceptance
    public static boolean retryCheck(Throwable e) {
        //No re-run if error message contains "Configuration failed"
        return !e.getMessage().contains("Configuration failed");
    }


}
