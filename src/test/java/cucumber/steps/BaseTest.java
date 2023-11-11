package cucumber.steps;

import desktop.fragments.*;
import utilis.*;

public class BaseTest {

    PageHelper ph = new PageHelper();

    CookieConsentDialog cookieConsentDialog = new CookieConsentDialog();

    RegistrationForm registrationForm = new RegistrationForm();

    CustomerInterestsDialog customerInterestsDialog = new CustomerInterestsDialog();

    MyAccountPopUp myAccountPopUp = new MyAccountPopUp();

    HeaderComponent headerComponent = new HeaderComponent();

    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
}
