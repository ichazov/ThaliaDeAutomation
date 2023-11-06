package cucumber.runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "html:src/target/cucumber-reports"},
        monochrome = true,
        tags = "@Test",
        glue = {"cucumber.steps", "cucumber.hooks"},
        features = "src/test/resources/features"
)

public class TestRunner {
}
