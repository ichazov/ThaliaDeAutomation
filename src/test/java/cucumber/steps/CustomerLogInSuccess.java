package cucumber.steps;

import io.cucumber.java.en.*;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerLogInSuccess extends BaseTest {

    @But("Customer enters following credentials:")
    public void enterMyValidCredentials(Map<String, String> data) {
        headerComponent.clickMyAccountIcon();
        myAccountPopUp.enterEmail(data.get("Email"))
                .enterPassword(data.get("Password"));
    }

    @But("Customer clicks the Login button")
    public void clickTheLoginButton() {
        myAccountPopUp.clickLogInButton();
    }

    @Then("Customer should be successfully logged in")
    public void verifyLoggedIn() {
        assertThat(headerComponent.isLoggedIn())
                .as("Customer isn't logged in")
                .isTrue();
    }
}
