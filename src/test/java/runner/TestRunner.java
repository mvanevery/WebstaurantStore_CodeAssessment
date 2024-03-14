package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/testResources/features",
        glue = {"stepDefinitions","appHooks"},
        tags = "@test",
        plugin = {"pretty", "json:target/cucumber-report/cucumber.json"}
)

public class TestRunner {}