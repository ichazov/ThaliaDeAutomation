package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class SingletonDriver {

    private SingletonDriver() {
    }

    public static void getWebDriverInstance(String driverName) {
        switch (driverName.toLowerCase()) {
            case "firefox":
                setFirefoxInstance();
                break;
            case "chrome":
                setChromeInstance();
                break;
            default:
                break;
        }
    }

    private static void setChromeInstance() {
        WebDriverManager.chromedriver().cachePath("src/main/resources/").avoidOutputTree().setup();
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        setWebDriver(driver);
    }

    private static void setFirefoxInstance() {
        WebDriverManager.firefoxdriver().cachePath("src/main/resources/").avoidOutputTree().setup();
        System.setProperty("webdriver.firefox.driver", "src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver(new FirefoxOptions().setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe"));
        setWebDriver(driver);
    }

    public static WebDriver getDriver() {
        return getWebDriver();
    }

    public static void quitDriver() {
        closeWebDriver();
    }
}
