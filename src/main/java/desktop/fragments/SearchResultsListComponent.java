package desktop.fragments;

import abstractclasses.*;
import desktop.products.*;
import org.openqa.selenium.*;

import java.util.*;
import java.util.stream.*;

import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsListComponent extends AbstractFragment {

    private static final By ROOT = By.className("tm-produktliste");

    private static final By PRODUCT = By.className("artikel");

    public SearchResultsListComponent() {
        setRootElement(ROOT);
    }

    public List<ProductItemInSearchResultsList> getListOfProducts() {
        return new ArrayList<>($$(PRODUCT)).stream()
                .map(e -> ProductItemInSearchResultsList.builder()
                        .productPageLink(e.find(ProductItemInSearchResultsList.getPRODUCT_LINK_LOCATOR()))
                        .title(e.find(ProductItemInSearchResultsList.getTITLE_LOCATOR()).getText())
                        .build())
                .collect(Collectors.toList());
    }

    public ProductItemInSearchResultsList getProductFromList(int index) {
        //Ideally we should use product's SKU for this.
        //For now selecting a product by index would do.
        return getListOfProducts().get(index);
    }
}
