package cucumber.steps;

import abstractclasses.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.*;
import utilis.*;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class CustomerRegistration extends BaseTest {

    @Given("Customer is on the {string} page")
    public void openRegistrationPage(String pageName) throws InterruptedException {
        AbstractPage page = ph.getPageByName(pageName);
        open(page.getPageUrl());
        cookieConsentDialog.acceptNecessaryCookies();
        assertThat(getWebDriver().getCurrentUrl())
                .as("Unexpected URL")
                .isEqualTo(page.getPageUrl() + "/");
    }

    @But("Customer fills in the registration form")
    public void fillInRegistrationForm() {
        registrationForm.enterEmail(DataHelper.generateEmailAddress(6))
                .enterPassword(DataHelper.generatePassword(8))
                .enterBirthdayDay(DataHelper.generateRandomDay())
                .enterBirthdayMonth(DataHelper.generateRandomMonth())
                .enterBirthdayYear(DataHelper.generateRandomYear())
                .markDataPrivacyCheckbox();
    }

    @But("Customer clicks the Register button")
    public void clickTheRegisterButton() {
        registrationForm.clickCreateAccountButton();
    }

    @Then("Customer should be redirected to {string} page")
    public void verifyRedirectedToMyAccountPage(String pageName) {
        //WaitHelper implicitly does the assertion. Not sure if I should keep assertThat(); method.
        //Let's keep it as is for now.
        AbstractPage page = ph.getPageByName(pageName);
        WaitHelper.waitForCondition(ExpectedConditions.urlMatches(page.getPageUrlPattern()));
        assertThat(getWebDriver().getCurrentUrl())
                .as("Unexpected URL")
                .matches(page.getPageUrlPattern());
    }

    @But("Customer Interests dialog is displayed")
    public void closeCustomerInterestsDialog() {
        slideInPanel.clickSecondaryButton();
    }
}
