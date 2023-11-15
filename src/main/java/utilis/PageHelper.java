package utilis;

import abstractclasses.*;
import desktop.pages.*;

import java.util.*;

public class PageHelper {

    private static final Map<String, AbstractPage> pages = new HashMap<>();

    public PageHelper() {
        pages.put("Registration", new Registration());
        pages.put("My Account", new MyAccount());
        pages.put("Home", new Home());
        pages.put("Forgot Password", new ForgotPassword());
        pages.put("Search Results", new SearchResults());
        pages.put("Product Details", new ProductDetails());
        pages.put("Login", new Login());
        pages.put("Billing Address", new BillingAddress());
        pages.put("Order Review", new OrderReview());
        pages.put("PayPal", new PayPal());
    }

    public AbstractPage getPageByName(String pageName) {
        return pages.get(pageName);
    }
}
