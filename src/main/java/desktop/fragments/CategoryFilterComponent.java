package desktop.fragments;

import abstractclasses.*;
import org.openqa.selenium.*;

public class CategoryFilterComponent extends AbstractFragment {

    private static final By ROOT = By.className("kategoriefilter");

    private static final By AUDIOBOOKS_FILTER = By.cssSelector("[value='3677']");

    private static final By EBOOKS_FILTER = By.cssSelector("[value='4893']");

    public CategoryFilterComponent() {
        setRootElement(ROOT);
    }

    public void selectAudiobooksFilter() {
        jsClick(AUDIOBOOKS_FILTER);
    }

    public void selectEbooksFilter() {
        jsClick(EBOOKS_FILTER);
    }
}
