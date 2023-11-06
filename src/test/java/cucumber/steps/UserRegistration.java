package cucumber.steps;

import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.open;

public class UserRegistration {
    @Given("I am on the registration page")
    public void openRegistrationPage() {
        open("https://google.com/");
    }
}
