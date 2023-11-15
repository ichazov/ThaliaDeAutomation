package desktop.fragments;

import abstractclasses.*;
import com.codeborne.selenide.*;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selenide.$;

public class RelatedProductsContainer extends AbstractFragment {

    private static final By ROOT = By.cssSelector("[component='hinzugefuegt-overlay-inhalt']");

    private static final By CLOSE_BUTTON = By.cssSelector("[component='hinzugefuegt-overlay-inhalt']");

    private static final By OPEN_CART_BUTTON = By.className("warenkorb-oeffnen");

    public RelatedProductsContainer() {
        setRootElement(ROOT);
    }

    public void clickOpenCartButton() {
        clickButton(OPEN_CART_BUTTON);
    }

    public Boolean isDisplayed() {
        return $(CLOSE_BUTTON).shouldBe(Condition.visible).isDisplayed();
    }
}
