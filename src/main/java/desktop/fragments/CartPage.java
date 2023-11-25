package desktop.fragments;

import abstractclasses.*;
import desktop.products.*;
import org.openqa.selenium.*;

import java.util.*;
import java.util.stream.*;

import static com.codeborne.selenide.Selenide.$$;

public class CartPage extends AbstractFragment {

    private static final By ROOT = By.className("page-main-container");

    private static final By PRODUCT = By.className("artikel");

    private static final By CHECKOUT_BUTTON = By.className("kaufen-button");

    public CartPage() {
        setRootElement(ROOT);
    }

    public List<ProductInCart> getListOfProducts() {
        return new ArrayList<>($$(PRODUCT)).stream()
                .map(e -> ProductInCart.builder()
                        .title(e.find(ProductInCart.getPRODUCT_TITLE_AND_LINK_LOCATOR()).getText())
                        .build())
                .collect(Collectors.toList());
    }

    public void clickCheckoutButton() {
        clickButton(CHECKOUT_BUTTON);
    }
}
