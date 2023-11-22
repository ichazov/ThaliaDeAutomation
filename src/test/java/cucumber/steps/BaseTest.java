package cucumber.steps;

import desktop.fragments.*;
import utilis.*;

public class BaseTest {

    PageHelper ph = new PageHelper();

    CookieConsentDialog cookieConsentDialog = new CookieConsentDialog();

    RegistrationForm registrationForm = new RegistrationForm();

    CustomerInterestsContainer customerInterestsDialog = new CustomerInterestsContainer();

    MyAccountPopUp myAccountPopUp = new MyAccountPopUp();

    HeaderComponent headerComponent = new HeaderComponent();

    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    SearchResultsListComponent searchResultsListComponent = new SearchResultsListComponent();

    ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    RelatedProductsContainer relatedProductsContainer = new RelatedProductsContainer();

    CartPage cartPage = new CartPage();

    LoginPage loginPage = new LoginPage();

    BillingAddressPage billingAddressPage = new BillingAddressPage();

    OrderReviewPage orderReviewPage = new OrderReviewPage();

    CategoryFilterComponent categoryFilterComponent = new CategoryFilterComponent();

    SelectedFiltersComponent selectedFiltersComponent = new SelectedFiltersComponent();

    FiltersPanel filtersPanel = new FiltersPanel();

    AllFiltersContainer allFiltersContainer = new AllFiltersContainer();

    PriceFilterAccordion priceFilterAccordion = new PriceFilterAccordion();
}
