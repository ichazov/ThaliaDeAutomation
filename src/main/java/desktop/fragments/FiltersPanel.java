package desktop.fragments;

import abstractclasses.*;
import com.codeborne.selenide.*;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selenide.$$;

public class FiltersPanel extends AbstractFragment {

    private static final By ROOT = By.className("filtergruppen");

    private static final By FILTER_CHIP = By.cssSelector("button.only-visible-for-non-touch-devices");

    public FiltersPanel() {
        setRootElement(ROOT);
    }

    public void clickFilterChip(String filterName) {
        $$(FILTER_CHIP).filter(Condition.ownText(filterName))
                .first()
                .click();
    }

    public void openPriceFilter() {
        clickFilterChip("Preis");
    }
}
