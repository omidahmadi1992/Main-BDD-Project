package tek.bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// This class serves as the entry point for running Cucumber tests
// This class is used to run our Cucumber tests
@RunWith(Cucumber.class) // Tells JUnit to use Cucumber to run the tests in this class
@CucumberOptions(
        features = "classpath:features", // This points to the location of our feature files
        glue = "tek.bdd.steps", // This is the package where we find the step definitions
        // (the code behind the scenarios)
        tags = "@Regression", // We only want to run tests that are marked with the @Regression tag
        dryRun = false, // Setting this to false means we will actually run the tests
        plugin = {
                "html:target/cucumber-report/report.html", // This creates an HTML report of the test results
                "json:target/jsonReport/report.json" // This creates a JSON report of the test results
        }
)
public class TestRunner {
}
