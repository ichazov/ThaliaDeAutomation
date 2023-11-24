package cucumber.steps;

import desktop.fragments.*;
import utilis.*;

public class BaseTest {

    PageHelper ph = new PageHelper();

    CookieConsentDialog cookieConsentDialog = new CookieConsentDialog();

    RegistrationForm registrationForm = new RegistrationForm();

    MyAccountPopUp myAccountPopUp = new MyAccountPopUp();

    HeaderComponent headerComponent = new HeaderComponent();

    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    SearchResultsListComponent searchResultsListComponent = new SearchResultsListComponent();

    ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    CartPage cartPage = new CartPage();

    LoginPage loginPage = new LoginPage();

    BillingAddressPage billingAddressPage = new BillingAddressPage();

    OrderReviewPage orderReviewPage = new OrderReviewPage();

    CategoryFilterComponent categoryFilterComponent = new CategoryFilterComponent();

    SelectedFiltersComponent selectedFiltersComponent = new SelectedFiltersComponent();

    FiltersPanel filtersPanel = new FiltersPanel();

    PriceFilterAccordion priceFilterAccordion = new PriceFilterAccordion();

    SlideInPanel slideInPanel = new SlideInPanel();
}
