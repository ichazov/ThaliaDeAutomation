package desktop.fragments;

import abstractclasses.*;
import desktop.products.*;
import org.openqa.selenium.*;

import java.util.*;
import java.util.stream.*;

import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsList extends AbstractFragment {

    private static final By ROOT = By.className("tm-produktliste");

    private static final By PRODUCT = By.className("artikel");

    public SearchResultsList() {
        setRootElement(ROOT);
    }

    public List<ProductInSearchResults> getListOfProducts() {
        return new ArrayList<>($$(PRODUCT)).stream()
                .map(e -> ProductInSearchResults.builder()
                        .productPageLink(e.find(ProductInSearchResults.getPRODUCT_LINK_LOCATOR()))
                        .title(e.find(ProductInSearchResults.getTITLE_LOCATOR()).getText())
                        .productFormat(e.find(ProductInSearchResults.getPRODUCT_FORMAT_LOCATOR()).getText())
                        .productPrice(e.find(ProductInSearchResults.getPRODUCT_PRICE_LOCATOR())
                                .attr("price"))
                        .build())
                .collect(Collectors.toList());
    }
}
