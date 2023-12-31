package cucumber.hooks;

import com.codeborne.selenide.*;
import io.cucumber.java.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utilis.ScreenshotHelper;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class DriverHooks {

    Logger logger = LoggerFactory.getLogger(DriverHooks.class);

    @Before
    public void setUpTest() {
        logger.info("Setting up driver...");
        Configuration.browser = "Chrome";
        Configuration.pageLoadStrategy = "eager";
        open();
        getWebDriver().manage().window().maximize();
        logger.info("Driver is ready!");
    }

    @After
    public void tearDown(Scenario s) {
        logger.info("Taking screenshot after {} scenario execution...", s.getName());
        ScreenshotHelper.takeScreenshot(s);
        logger.info("Done taking screenshot!");
        logger.info("{} scenario execution is finished", s.getName());
        closeWebDriver();
    }
}
