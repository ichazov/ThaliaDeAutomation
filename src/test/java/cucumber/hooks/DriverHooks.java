package cucumber.hooks;

import driver.SingletonDriver;
import io.cucumber.java.Scenario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utilis.ScreenshotHelper;

public class DriverHooks {
    Logger logger = LoggerFactory.getLogger(DriverHooks.class);
    @BeforeTest
    public void setUpTest() {
        logger.info("Setting up driver...");
        SingletonDriver.getWebDriverInstance("chrome");
        SingletonDriver.getDriver().manage().window().maximize();
        logger.info("Driver is ready!");
    }
    @AfterTest
    public void tearDown(Scenario s) {
        logger.info("Taking screenshot after {} scenario execution...", s.getName());
        ScreenshotHelper.takeScreenshot(s);
        logger.info("Done taking screenshot!");
        logger.info("Quiting driver...");
        SingletonDriver.quitDriver();
        logger.info("Done quitting driver!");
    }
}
