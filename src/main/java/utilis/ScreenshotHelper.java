package utilis;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;

public class ScreenshotHelper {

    private ScreenshotHelper() {
    }

    public static void takeScreenshot(Scenario s) {
        String fileName = StringUtils.capitalize(s.getName())
                .replaceAll("[^a-zA-Z]", "")
                .concat(".jpg");
        byte[] bytes = Selenide.screenshot(OutputType.BYTES);
        try {
            if (bytes != null) {
                FileUtils.writeByteArrayToFile(new File("src/target/screenshots/" + fileName), bytes);
                s.attach(bytes, "image/jpg", fileName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
