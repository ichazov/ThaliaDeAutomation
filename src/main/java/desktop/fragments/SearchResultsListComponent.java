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
                        .productFormat(e.find(ProductItemInSearchResultsList.getPRODUCT_FORMAT_LOCATOR()).getText())
                        .productPrice(e.find(ProductItemInSearchResultsList.getPRODUCT_PRICE_LOCATOR())
                                .attr("price"))
                        .build())
                .collect(Collectors.toList());
    }
}
