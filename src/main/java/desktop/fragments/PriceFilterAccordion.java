package desktop.fragments;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import utilis.*;

import java.util.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class PriceFilterAccordion extends AllFiltersContainer {

    private static final By ROOT = By.cssSelector("[data-overlay-gruppe='Preis']");

    private static final By MIN_PRICE_FIELD = By.cssSelector(".text-input [name='min']");

    private static final By MAX_PRICE_FIELD = By.cssSelector(".text-input [name='max']");

    private static final By LOAD_SPINNER = By.className("thalia-ladespinner");

    public PriceFilterAccordion() {
        super(ROOT);
    }

    private void setPriceValue(By locator, String s) {
        actions().click(getInteractableElement(locator))
                .sendKeys(Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE))
                .sendKeys(s)
                .sendKeys(Keys.chord(Keys.ENTER))
                .perform();

        WaitHelper.waitForCondition(ExpectedConditions.invisibilityOf($(LOAD_SPINNER)));

        if (!Objects.equals($(locator).getValue(), s)) {
            setPriceValue(locator, s);
        }
    }

    public PriceFilterAccordion enterPriceFrom(String priceFrom) {
        setPriceValue(MIN_PRICE_FIELD, priceFrom);
        return this;

    }

    public PriceFilterAccordion enterPriceTo(String priceTo) {
        setPriceValue(MAX_PRICE_FIELD, priceTo);
        return this;
    }
}
