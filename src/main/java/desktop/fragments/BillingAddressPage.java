package desktop.fragments;

import abstractclasses.*;
import org.openqa.selenium.*;

public class BillingAddressPage extends AbstractFragment {

    private static final By ROOT = By.cssSelector("[component='rechnungsanschrift-privat-formular']");

    private static final By TITLE_DROPDOWN = By.name("anrede");

    private static final By FIRST_NAME_FIELD = By.id("vorname");

    private static final By LAST_NAME_FIELD = By.id("nachname");

    private static final By STREET_FIELD = By.id("strasse");

    private static final By HOUSE_NUMBER_FIELD = By.id("hausnummer");

    private static final By POSTAL_CODE_FIELD = By.id("plz");

    private static final By CITY_FIELD = By.id("ort");

    private static final By SUBMIT_BUTTON = By.className("submit-button");

    public BillingAddressPage() {
        setRootElement(ROOT);
    }

    public BillingAddressPage selectTitle(String title) {
        selectFromDropdown(TITLE_DROPDOWN, title);
        return this;
    }

    public BillingAddressPage enterFirstName(String firstName) {
        enterTextIntoField(FIRST_NAME_FIELD, firstName);
        return this;
    }

    public BillingAddressPage enterLastName(String lastName) {
        enterTextIntoField(LAST_NAME_FIELD, lastName);
        return this;
    }

    public BillingAddressPage enterStreet(String street) {
        enterTextIntoField(STREET_FIELD, street);
        return this;
    }

    public BillingAddressPage enterHouseNumber(String houseNumber) {
        enterTextIntoField(HOUSE_NUMBER_FIELD, houseNumber);
        return this;
    }

    public BillingAddressPage enterPostalCode(String postalCode) {
        enterTextIntoField(POSTAL_CODE_FIELD, postalCode);
        return this;
    }

    public BillingAddressPage enterCity(String city) {
        enterTextIntoField(CITY_FIELD, city);
        return this;
    }

    public void clickSubmitButton() {
        clickButton(SUBMIT_BUTTON);
    }
}
