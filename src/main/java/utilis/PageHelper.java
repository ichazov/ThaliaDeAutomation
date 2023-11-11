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
    }

    public AbstractPage getPageByName(String pageName) {
        return pages.get(pageName);
    }
}
