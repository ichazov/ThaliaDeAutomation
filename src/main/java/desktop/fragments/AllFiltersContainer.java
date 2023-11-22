package desktop.fragments;

import abstractclasses.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.pagefactory.*;

public class AllFiltersContainer extends AbstractFragment {

    private static final By ROOT = By.className("suche-filter-overlay");

    private static final By APPLY_BUTTON = By.cssSelector("[interaction='filterauswahl-anwenden']");

    public AllFiltersContainer() {
        setRootElement(ROOT);
    }

    protected AllFiltersContainer(By root) {
        setRootElement(new ByChained(ROOT, root));
    }

    public void clickApplyFiltersButton() {
        clickButton(APPLY_BUTTON);
    }
}
