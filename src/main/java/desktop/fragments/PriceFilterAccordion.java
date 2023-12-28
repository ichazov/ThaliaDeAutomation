package desktop.fragments;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import utilis.*;

import static com.codeborne.selenide.Selenide.*;

public class PriceFilterAccordion extends SlideInPanel {

    private static final By ROOT = By.cssSelector("[data-overlay-gruppe='Preis']");

    private static final By MIN_PRICE_FIELD = By.cssSelector(".text-input [name='min']");

    private static final By MAX_PRICE_FIELD = By.cssSelector(".text-input [name='max']");

    private static final By LOAD_SPINNER = By.className("thalia-ladespinner");

    public PriceFilterAccordion() {
        new SlideInPanel(ROOT);
    }

    private void setPriceValue(By locator, String s) {
        int maxRetries = 9;
        int retry = 0;

        while (!s.equals($(locator).getValue())) {
            retry++;
            actions().click(getInteractableElement(locator))
                    .sendKeys(Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE))
                    .sendKeys(s)
                    .sendKeys(Keys.chord(Keys.ENTER))
                    .perform();

            WaitHelper.waitForCondition(ExpectedConditions.invisibilityOf($(LOAD_SPINNER)));
            if (maxRetries == retry) {
                break;
            }
        }
    }

    public PriceFilterAccordion enterPriceFrom(String priceFrom) {
        getInteractableElement(MIN_PRICE_FIELD).setValue(priceFrom);
        WaitHelper.waitForCondition(ExpectedConditions.invisibilityOf($(LOAD_SPINNER)));
        return this;
    }

    public PriceFilterAccordion enterPriceTo(String priceTo) {
        setPriceValue(MAX_PRICE_FIELD, priceTo);
        return this;
    }
}
