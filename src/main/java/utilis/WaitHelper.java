package utilis;

import org.openqa.selenium.support.ui.*;

import java.time.*;

import static com.codeborne.selenide.Selenide.Wait;

public class WaitHelper {

    private WaitHelper() {
    }

    public static <T> void waitForCondition(int timeout, int pollingInterval, ExpectedCondition<T> condition) {
        Wait().withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofSeconds(pollingInterval))
                .until(condition);
    }
}
