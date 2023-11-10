package abstractclasses;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public abstract class AbstractFragment {

    private By rootElement;

    protected void setRootElement(By locator) {
        this.rootElement = locator;
    }

    protected By getRootElement() {
        return rootElement;
    }

    protected void selectFromDropdown(By locator, String s) {
        $(locator).selectOptionContainingText(s);
    }

    protected void clickButton(By locator) {
        $(locator).shouldBe(Condition.interactable).click();
    }

    protected String getElementText(By locator) {
        return $(locator).getText();
    }

    protected void enterTextIntoField(By locator, String s) {
        $(locator).sendKeys(s);
    }

    protected List<String> getListOfErrorMessages(By locator) {
        return new ArrayList<>($$(locator).texts());
    }

    protected void switchToFrame(By locator) {
        switchTo().frame($(locator));
    }

    protected void switchToDefaultContent() {
        switchTo().defaultContent();
    }

    protected void acceptRejectCookieConsent(By locator1, By locator2) {
        $(locator1).shouldBe(Condition.visible, Duration.ofSeconds(10));
        clickButton(locator2);
    }

    protected List<String> getDisplayedValidationErrors(By locator) {
        return new ArrayList<>($$(locator).texts());
    }
}
