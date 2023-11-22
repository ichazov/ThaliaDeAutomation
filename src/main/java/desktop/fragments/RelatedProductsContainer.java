package desktop.fragments;

import abstractclasses.*;
import org.openqa.selenium.*;

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
        return isElementDisplayed(CLOSE_BUTTON);
    }
}
