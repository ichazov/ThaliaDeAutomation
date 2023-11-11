package desktop.fragments;

import abstractclasses.*;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selenide.$;

public class MyAccountPopUp extends AbstractFragment {

    private static final By ROOT = By.cssSelector("[component='login-form-kompakt']");

    private static final By INVALID_CREDENTIALS_ERROR_MESSAGE = By.className("fehler");

    private static final By EMAIL_FIELD = By.className("input-email");

    private static final By PASSWORD_FIELD = By.className("input-passwort");

    private static final By FORGOT_PASSWORD_LINK = By.className("passwort-vergessen");

    private static final By LOG_IN_BUTTON = By.className("button-submit");

    public MyAccountPopUp() {
        setRootElement(ROOT);
    }

    public MyAccountPopUp enterEmail(String email) {
        enterTextIntoField(EMAIL_FIELD, email);
        return this;
    }

    public MyAccountPopUp enterPassword(String password) {
        enterTextIntoField(PASSWORD_FIELD, password);
        return this;
    }

    public void followForgotPasswordLink() {
        clickButton(FORGOT_PASSWORD_LINK);
    }

    public void clickLogInButton() {
        clickButton(LOG_IN_BUTTON);
    }

    public boolean isInvalidCredentialsErrorDisplayed() {
        return $(INVALID_CREDENTIALS_ERROR_MESSAGE).getText().isEmpty();
    }
}
