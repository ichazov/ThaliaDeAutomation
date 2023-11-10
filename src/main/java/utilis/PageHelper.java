package utilis;

import abstractclasses.*;
import desktop.pages.*;

import java.util.*;

public class PageHelper {

    private static final Map<String, AbstractPage> pages = new HashMap<>();

    public PageHelper() {
        pages.put("Registration", new Registration());
        pages.put("My Account", new MyAccount());
    }

    public AbstractPage getPageByName(String pageName) {
        return pages.get(pageName);
    }
}
