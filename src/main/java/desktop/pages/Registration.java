package desktop.pages;

import abstractclasses.*;

public class Registration extends AbstractPage {

    public Registration() {
        setPageUrl(Urls.REGISTRATION_PAGE_URL);
        setPageUrlPattern(UrlPatterns.REGISTRATION_PAGE_URL_PATTERN);
    }
}
