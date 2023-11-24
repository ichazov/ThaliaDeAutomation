package cucumber.steps;

import desktop.products.*;
import entities.*;
import io.cucumber.java.en.*;
import io.cucumber.java.DataTableType;
import org.assertj.core.api.*;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class GuestCustomerPurchase extends BaseTest {

    @DataTableType
    public Customer customerTransformer(Map<String, String> data) {
        return new Customer(
                data.get("Title"),
                data.get("First Name"),
                data.get("Last Name"),
                data.get("Street"),
                data.get("House"),
                data.get("Postal Code"),
                data.get("City")
        );
    }

    @When("Customer searches for a desired product")
    public void searchForProduct() {
        headerComponent.enterSearchTerm("1984")
                .clickSearchButton();
    }

    @But("Search results list contains products that correspond to the search term")
    public void verifyListOfSearchResults() {
        List<ProductItemInSearchResultsList> products = searchResultsListComponent.getListOfProducts();
        assertThat(products)
                .as("No products matching the search term found")
                .anyMatch(p -> Objects.equals(p.getTitle(), "1984"));
    }

    @When("Customer opens desired product's page")
    public void opensProductPage() {
        searchResultsListComponent.getListOfProducts().get(0).openProductPage();
    }

    @When("Customer adds product to the shopping cart")
    public void addProductToCart() {
        productDetailsPage.clickAddToCartButton();
    }

    @But("Product is successfully added to cart")
    public void verifyProductAddedToCart() {
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(slideInPanel.isDisplayed())
                .as("Related Products container isn't displayed")
                .isTrue();
        softly.assertThat(headerComponent.getNumberOfProductsInCart())
                .as("Unexpected number of products in cart")
                .isEqualTo("1");

        slideInPanel.clickPrimaryButton();

        softly.assertThat(cartPage.getListOfProducts())
                .as("Unexpected number of products in cart")
                .hasSize(1);
        softly.assertAll();
    }

    @But("Customer clicks Checkout button")
    public void clickCheckoutButton() {
        cartPage.clickCheckoutButton();
    }

    @When("Customer clicks Create Account button")
    public void clicksCreateAccountButton() {
        loginPage.clickCreateAccountButton();
    }

    @When("Customer fills in the Billing address form")
    public void fillsInBillingAddressForm(List<Customer> customers) {
        for (Customer customer : customers) {
            billingAddressPage.selectTitle(customer.getTitle())
                    .enterFirstName(customer.getFirstName())
                    .enterLastName(customer.getLastName())
                    .enterStreet(customer.getStreet())
                    .enterHouseNumber(customer.getHouse())
                    .enterPostalCode(customer.getPostalCode())
                    .enterCity(customer.getCity());
        }
    }

    @But("Customer clicks Submit button")
    public void clickSubmitButton() {
        billingAddressPage.clickSubmitButton();
    }

    @When("Customer clicks Buy button")
    public void clickBuyButton() {
        orderReviewPage.clickBuyButton();
    }
}
