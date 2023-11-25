package cucumber.steps;

import io.cucumber.java.en.*;

import java.math.*;

import static org.assertj.core.api.Assertions.assertThat;

public class FilteringByPriceRange extends BaseTest {

    @When("Customer sets the price range from €{int} to €{int}")
    public void setPriceRange(int priceFrom, int priceTo) {
        filtersPanel.openPriceFilter();
        priceFilterAccordion.enterPriceFrom(String.valueOf(priceFrom))
                .enterPriceTo(String.valueOf(priceTo))
                .clickPrimaryButton();

        assertThat(selectedFiltersPanel.isPriceRangeLabelDisplayed())
                .as("Price range label is not displayed")
                .isTrue();
    }

    @Then("Customer should see list of products that fall within the €{int} to €{int} price range")
    public void verifyListOfProducts(int minPrice, int maxPrice) {
        BigDecimal min = new BigDecimal(minPrice);
        BigDecimal max = new BigDecimal(maxPrice);

        assertThat(searchResultsList.getListOfProducts())
                .as("List contains products with prices outside the specified price range")
                .isNotEmpty()
                .allMatch(p -> p.getProductPrice().compareTo(min) >= 0 && p.getProductPrice().compareTo(max) <= 0);
    }
}
