package utilis;

import org.openqa.selenium.support.ui.*;

import java.time.*;

import static com.codeborne.selenide.Selenide.Wait;

public class WaitHelper {

    private WaitHelper() {
    }

    public static <T> void waitForCondition(ExpectedCondition<T> condition) {
        Wait().withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .until(condition);
    }
}
