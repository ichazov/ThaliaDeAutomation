package abstractclasses;

import com.codeborne.selenide.*;
import org.openqa.selenium.*;

import java.time.*;
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

    private SelenideElement getInteractableElement(By locator) {
        return $(getRootElement()).$(locator).shouldBe(Condition.interactable, Duration.ofSeconds(10));
    }

    protected void selectFromDropdown(By locator, String s) {
        getInteractableElement(locator).selectOptionContainingText(s);
    }

    protected void clickButton(By locator) {
        getInteractableElement(locator).click();
    }

    protected String getElementText(By locator) {
        return getInteractableElement(locator).getText();
    }

    protected void enterTextIntoField(By locator, String s) {
        getInteractableElement(locator).sendKeys(s);
    }

    protected void switchToFrame(By locator) {
        switchTo().frame(getInteractableElement(locator));
    }

    protected void switchToDefaultContent() {
        switchTo().defaultContent();
    }

    protected List<String> getDisplayedValidationErrors(By locator) {
        return new ArrayList<>($$(locator).texts());
    }
}
