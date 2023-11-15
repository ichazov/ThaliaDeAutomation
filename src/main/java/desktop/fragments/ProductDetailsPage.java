package desktop.fragments;

import abstractclasses.*;
import org.openqa.selenium.*;

public class ProductDetailsPage extends AbstractFragment {

    private static final By ROOT = By.className("content-wrapper");

    private static final By ADD_TO_CART_BUTTON = By.className("warenkorb-button");

    public ProductDetailsPage() {
        setRootElement(ROOT);
    }

    public void clickAddToCartButton() {
        clickButton(ADD_TO_CART_BUTTON);
    }
}
