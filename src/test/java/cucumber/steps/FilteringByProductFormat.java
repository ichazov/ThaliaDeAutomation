package cucumber.steps;

import desktop.products.*;
import io.cucumber.java.en.*;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class FilteringByProductFormat extends BaseTest {

    @When("Customer selects Audiobooks category")
    public void selectCategory() {
        categoryFilterComponent.selectAudiobooksFilter();
        assertThat(selectedFiltersPanel.isAudioBooksCategoryLabelDisplayed())
                .as("Audiobooks category label is not displayed")
                .isTrue();
    }

    @Then("Customer should see list of products of selected category")
    public void verifyFilteredProductList() {
        List<ProductInSearchResults> ps = searchResultsList.getListOfProducts();
        assertThat(searchResultsList.getListOfProducts())
                .as("List comprises products from categories other than the one currently selected")
                .isNotEmpty()
                .allMatch(p -> p.getProductFormat().contains("H\u00F6rbuch"));
    }
}
