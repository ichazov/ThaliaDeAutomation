package desktop.fragments;

import abstractclasses.*;
import org.openqa.selenium.*;

public class OrderReviewPage extends AbstractFragment {

    private static final By ROOT = By.className("bestelluebersicht-centered");

    private static final By BUY_BUTTON = By.className("kaufen-button");

    public OrderReviewPage() {
        setRootElement(ROOT);
    }

    public void clickBuyButton() {
        clickButton(BUY_BUTTON);
    }
}
