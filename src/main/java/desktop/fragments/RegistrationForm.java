package desktop.fragments;

import abstractclasses.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import utilis.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class RegistrationForm extends AbstractFragment {

    private static final By ROOT = By.cssSelector("form.js");

    private static final By EMAIL_FIELD = By.name("email");

    private static final By PASSWORD_FIELD = By.name("passwort");

    private static final By BIRTHDAY_DAY_FIELD = By.name("geburtstagTag");

    private static final By BIRTHDAY_MONTH_FIELD = By.name("geburtstagMonat");

    private static final By BIRTHDAY_YEAR_FIELD = By.name("geburtstagJahr");

    private static final By DATA_PRIVACY_AGREEMENT_CHECKBOX = By.name("agb");

    private static final By CREATE_ACCOUNT_BUTTON = By.cssSelector(".submit-button");

    public RegistrationForm() {
        setRootElement(ROOT);
    }

    public RegistrationForm enterEmail(String email) {
        enterTextIntoField(EMAIL_FIELD, email);
        return this;
    }

    public RegistrationForm enterPassword(String password) {
        enterTextIntoField(PASSWORD_FIELD, password);
        return this;
    }

    public RegistrationForm enterBirthdayDay(String birthdayDay) {
        enterTextIntoField(BIRTHDAY_DAY_FIELD, birthdayDay);
        return this;
    }

    public RegistrationForm enterBirthdayMonth(String birthdayMonth) {
        enterTextIntoField(BIRTHDAY_MONTH_FIELD, birthdayMonth);
        return this;
    }

    public RegistrationForm enterBirthdayYear(String birthdayYear) {
        enterTextIntoField(BIRTHDAY_YEAR_FIELD, birthdayYear);
        return this;
    }

    public RegistrationForm markDataPrivacyCheckbox() {
        JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
        jse.executeScript("arguments[0].click();", $(DATA_PRIVACY_AGREEMENT_CHECKBOX));
        return this;
    }

    public void clickCreateAccountButton() {
        clickButton(CREATE_ACCOUNT_BUTTON);
        WaitHelper.waitForCondition(
                10,
                2,
                ExpectedConditions.visibilityOf($(By.className("kundeninteressen-overlay"))));
    }
}
