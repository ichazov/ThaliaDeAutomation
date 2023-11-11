package desktop.pages;

import abstractclasses.*;

public class ForgotPassword extends AbstractPage {

    public ForgotPassword() {
        setPageUrl(Urls.FORGOT_PASSWORD_PAGE_URL);
        setPageUrlPattern(UrlPatterns.FORGOT_PASSWORD_PAGE_URL_PATTERN);
    }
}
