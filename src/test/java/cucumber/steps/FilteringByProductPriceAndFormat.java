package cucumber.steps;

import desktop.products.*;
import io.cucumber.java.en.*;
import org.assertj.core.api.*;

import java.math.*;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class FilteringByProductPriceAndFormat extends BaseTest {

    @When("Customer selects the eBooks category")
    public void selectCategory() {
        categoryFilterComponent.selectEbooksFilter();
        assertThat(selectedFiltersPanel.isEbooksCategoryLabelDisplayed())
                .as("eBook category label is not displayed")
                .isTrue();
    }

    @Then("Customer should see list of eBooks that fall within the €{int} to €{int} price range")
    public void verifyListOfProduct(int minPrice, int maxPrice) {
        BigDecimal min = new BigDecimal(minPrice);
        BigDecimal max = new BigDecimal(maxPrice);
        SoftAssertions softly = new SoftAssertions();
        List<ProductInSearchResults> products = searchResultsList.getListOfProducts();

        softly.assertThat(products)
                .as("List contains products with prices outside the specified price range")
                .isNotEmpty()
                .allMatch(p -> p.getProductPrice().compareTo(min) >= 0 && p.getProductPrice().compareTo(max) <= 0);
        softly.assertThat(products)
                .as("List comprises products from categories other than the one currently selected")
                .isNotEmpty()
                .allMatch(p -> p.getProductFormat().contains("eBook"));
        softly.assertAll();
    }
}
