package desktop.fragments;

import abstractclasses.*;
import org.openqa.selenium.*;

public class ForgotPasswordPage extends AbstractFragment {

    private static final By ROOT = By.cssSelector("[component=passwort-vergessen]");

    private static final By EMAIL_FIELD = By.name("user");

    private static final By SUCCESS_MESSAGE = By.className("erfolg");

    private static final By RESET_PASSWORD_BUTTON = By.cssSelector(".passwort-vergessen-eingabe-container button");

    public ForgotPasswordPage() {
        setRootElement(ROOT);
    }

    public void enterEmail(String email) {
        enterTextIntoField(EMAIL_FIELD, email);
    }

    public void clickResetPasswordButton() {
        clickButton(RESET_PASSWORD_BUTTON);
    }

    public boolean isSuccessMessageDisplayed() {
        return !getElementText(SUCCESS_MESSAGE).isEmpty();
    }
}
