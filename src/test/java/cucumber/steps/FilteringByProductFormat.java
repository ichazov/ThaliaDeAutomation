package cucumber.steps;

import io.cucumber.java.en.*;

import static org.assertj.core.api.Assertions.assertThat;

public class FilteringByProductFormat extends BaseTest {

    @When("Customer selects Audiobooks category")
    public void selectCategory() {
        categoryFilterComponent.selectAudiobooksFilter();
        assertThat(selectedFiltersComponent.isAudioBooksCategoryLabelDisplayed())
                .as("Audiobooks category label is not displayed")
                .isTrue();
    }

    @Then("Customer should see list of products of selected category")
    public void verifyFilteredProductList() {
        assertThat(searchResultsListComponent.getListOfProducts())
                .as("List comprises products from categories other than the one currently selected")
                .isNotEmpty()
                .allMatch(p -> p.getProductFormat().contains("Hörbuch"));
    }
}
