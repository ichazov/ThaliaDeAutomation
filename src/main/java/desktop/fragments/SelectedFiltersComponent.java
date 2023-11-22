package desktop.fragments;

import abstractclasses.*;
import org.openqa.selenium.*;

public class SelectedFiltersComponent extends AbstractFragment {

    private static final By ROOT = By.className("aktivierte-filter");

    private static final By AUDIO_BOOKS_CATEGORY_LABEL = By.cssSelector("[value='3677']");

    private static final By EBOOKS_CATEGORY_LABEL = By.cssSelector("[value='4893']");

    private static final By PRICE_RANGE_LABEL = By.name("filterPREISSLIDER");

    public SelectedFiltersComponent() {
        setRootElement(ROOT);
    }

    public Boolean isAudioBooksCategoryLabelDisplayed() {
        return isElementDisplayed(AUDIO_BOOKS_CATEGORY_LABEL);

    }

    public Boolean isPriceRangeLabelDisplayed() {
        return isElementDisplayed(PRICE_RANGE_LABEL);
    }

    public Boolean isEbooksCategoryLabelDisplayed() {
        return isElementDisplayed(EBOOKS_CATEGORY_LABEL);
    }
}
