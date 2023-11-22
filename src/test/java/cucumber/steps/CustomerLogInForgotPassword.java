package cucumber.steps;

import abstractclasses.*;
import io.cucumber.java.en.*;
import org.assertj.core.api.*;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class CustomerLogInForgotPassword extends BaseTest {

    @But("Customer clicks Forgot password link")
    public void clicksForgotPasswordLink() {
        headerComponent.clickMyAccountIcon();
        myAccountPopUp.followForgotPasswordLink();
    }

    @Then("Customer should be redirected to the {string} page")
    public void verifyRedirectedToThePage(String pageName) {
        AbstractPage page = ph.getPageByName(pageName);
        assertThat(getWebDriver().getCurrentUrl())
                .as("Unexpected URL")
                .matches(page.getPageUrlPattern());
    }

    @But("Customer enters email address")
    public void customerEntersEmailAddress() {
        forgotPasswordPage.enterEmail("john.doe@example.com");
    }

    @But("Customer clicks Reset password button")
    public void clickResetPasswordButton() {
        forgotPasswordPage.clickResetPasswordButton();
    }

    @Then("Customer should see Success message")
    public void verifySuccessMessageDisplayed() {
        AssertionsForClassTypes.assertThat(forgotPasswordPage.isSuccessMessageDisplayed())
                .as("Success message isn't displayed")
                .isTrue();
    }
}
