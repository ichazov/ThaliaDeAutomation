package desktop.pages;

public class UrlPatterns {

    public static final String REGISTRATION_PAGE_URL_PATTERN = ".*/registrierung";

    public static final String MY_ACCOUNT_PAGE_URL_PATTERN = ".*/kunde/.*";

    public static final String FORGOT_PASSWORD_PAGE_URL_PATTERN = ".*/ersatzpasswort/.*";

    public static final String SEARCH_RESULTS_PAGE_URL_PATTERN = ".*/suche.*";

    public static final String PRODUCT_DETAILS_PAGE_URL_PATTERN = ".*/artikeldetails.*";

    public static final String LOGIN_PAGE_URL_PATTERN = ".*/login/login.*";

    public static final String BILLING_ADDRESS_PAGE_URL_PATTERN = ".*/rechnungsanschrift.*";

    public static final String ORDER_REVIEW_PAGE_URL_PATTERN = ".*/bestelluebersicht";

    public static final String PAYPAL_URL_PATTERN = ".*paypal.com/.*";

    private UrlPatterns() {
    }
}
