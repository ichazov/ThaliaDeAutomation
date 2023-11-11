package desktop.fragments;

import abstractclasses.*;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class HeaderComponent extends AbstractFragment {

    private static final By ROOT = By.className("header-prime-grid");

    private static final By MY_ACCOUNT_ICON = By.className("icon-login");

    public HeaderComponent() {
        setRootElement(ROOT);
    }

    public void clickMyAccountIcon() {
        clickButton(MY_ACCOUNT_ICON);
    }

    public Boolean isLoggedIn() {
        JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
        return jse.executeScript("return document.readyState").equals("complete") &&
                "eingeloggt".equals($(MY_ACCOUNT_ICON).getAttribute("status"));
    }
}
