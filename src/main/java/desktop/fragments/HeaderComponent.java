package desktop.fragments;

import abstractclasses.*;
import com.codeborne.selenide.*;
import org.openqa.selenium.*;

import java.time.*;

import static com.codeborne.selenide.Selenide.$;

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
        return $(MY_ACCOUNT_ICON)
                .shouldHave(
                        Condition.attribute("status", "eingeloggt"), Duration.ofSeconds(5))
                .has(Condition.attribute("status", "eingeloggt"));
    }

    public String getNumberOfProductsInCart() {
        return $(CART_ICON).getAttribute("count");
    }
}
