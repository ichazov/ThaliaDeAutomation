package desktop.fragments;

import abstractclasses.*;
import org.openqa.selenium.*;

public class LoginPage extends AbstractFragment {

    private static final By ROOT = By.className("page-content");

    private static final By CREATE_ACCOUNT_BUTTON = By.className("full-size-link-button");

    public LoginPage() {
        setRootElement(ROOT);
    }

    public void clickCreateAccountButton() {
        clickButton(CREATE_ACCOUNT_BUTTON);
    }
}
