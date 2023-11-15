package desktop.pages;

import abstractclasses.*;

public class PayPal extends AbstractPage {

    public PayPal() {
        setPageUrlPattern(UrlPatterns.PAYPAL_URL_PATTERN);
    }
}
