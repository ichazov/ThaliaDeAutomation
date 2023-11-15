package cucumber.runner;

import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:src/target/cucumber-reports"},
        monochrome = true,
        tags = "@GuestUserPurchase",
        glue = {"cucumber.steps", "cucumber.hooks"},
        features = "src/test/resources/features"
)

public class TestRunner {
}
