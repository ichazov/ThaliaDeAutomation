package cucumber.steps;

import io.cucumber.java.en.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerLogInInvalidCredentials extends BaseTest {

    @Then("Customer should see the invalid credentials error message")
    public void verifyInvalidCredentialsErrorMessageDisplayed() {
        assertThat(myAccountPopUp.isInvalidCredentialsErrorDisplayed())
                .as("Invalid credentials message isn't displayed")
                .isFalse();
    }

    @But("Customer is not logged in")
    public void verifyCustomerIsNotLoggedIn() {
        assertThat(headerComponent.isLoggedIn())
                .as("Customer is logged in")
                .isFalse();
    }
}
