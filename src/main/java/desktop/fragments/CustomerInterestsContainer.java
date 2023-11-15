package desktop.fragments;

import abstractclasses.*;
import org.openqa.selenium.*;

public class CustomerInterestsContainer extends AbstractFragment {

    private static final By ROOT = By.className("kundeninteressen-overlay");

    private static final By CLOSE_BUTTON_ONE = By.cssSelector("[data-test='overlay-schliessen-button1']");

    public CustomerInterestsContainer() {
        setRootElement(ROOT);
    }

    /**
     * Closes the dialog on the first step of selecting
     * customer interests
     */
    public void clickCloseButtonOne() {
        clickButton(CLOSE_BUTTON_ONE);
    }
}
