package desktop.pages;

import abstractclasses.*;

public class MyAccount extends AbstractPage {

    public MyAccount() {
        setPageUrl(Urls.MY_ACCOUNT_PAGE_URL);
        setPageUrlPattern(UrlPatterns.MY_ACCOUNT_PAGE_URL_PATTERN);
    }
}
