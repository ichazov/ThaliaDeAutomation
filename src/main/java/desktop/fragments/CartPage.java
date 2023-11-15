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

    public List<ProductItemInCart> getListOfProducts() {
        return new ArrayList<>($$(PRODUCT)).stream()
                .map(e -> ProductItemInCart.builder()
                        .title(e.find(ProductItemInCart.getPRODUCT_TITLE_AND_LINK_LOCATOR()).getText())
                        .build())
                .collect(Collectors.toList());
    }

    public ProductItemInCart getProductFromList(int index) {
        //Ideally we should use product's SKU for this.
        //For now selecting a product by index would do.
        return getListOfProducts().get(index);
    }

    public void clickCheckoutButton() {
        clickButton(CHECKOUT_BUTTON);
    }
}
