package desktop.fragments;

import abstractclasses.*;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class HeaderComponent extends AbstractFragment {

    private static final By ROOT = By.className("header-prime-grid");

    private static final By SEARCH_FIELD = By.className("kundeneingabe");

    private static final By SEARCH_BUTTON = By.cssSelector(".suche-formular [interaction='suchanfrage-abschicken']");

    private static final By MY_ACCOUNT_ICON = By.className("icon-login");

    private static final By CART_ICON = By.className("icon-warenkorb");

    public HeaderComponent() {
        setRootElement(ROOT);
    }

    public HeaderComponent enterSearchTerm(String searchTerm) {
        enterTextIntoField(SEARCH_FIELD, searchTerm);
        return this;
    }

    public void clickSearchButton() {
        clickButton(SEARCH_BUTTON);
    }

    public void clickMyAccountIcon() {
        clickButton(MY_ACCOUNT_ICON);
    }

    public Boolean isLoggedIn() {
        JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
        return jse.executeScript("return document.readyState").equals("complete") &&
                "eingeloggt".equals($(MY_ACCOUNT_ICON).getAttribute("status"));
    }

    public String getNumberOfProductsInCart() {
       return $(CART_ICON).getAttribute("count");
    }}
