package desktop.fragments;

import abstractclasses.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.pagefactory.*;

public class SlideInPanel extends AbstractFragment {

    private static final By ROOT = By.cssSelector(".element-overlay-slide-in[open]");

    private static final By CLOSE_BUTTON = By.className("element-overlay-close");

    private static final By PRIMARY_BUTTON = By.className("element-button-primary");

    private static final By SECONDARY_BUTTON = By.className("element-button-secondary");

    public SlideInPanel() {
        setRootElement(ROOT);
    }

    protected SlideInPanel(By root) {
        setRootElement(new ByChained(ROOT, root));
    }

    public void clickPrimaryButton() {
        clickButton(PRIMARY_BUTTON);
    }

    public void clickSecondaryButton() {
        clickButton(SECONDARY_BUTTON);
    }

    public Boolean isDisplayed() {
        return isElementDisplayed(CLOSE_BUTTON);
    }
}
