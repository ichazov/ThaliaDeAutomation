package desktop.fragments;

import com.codeborne.selenide.*;
import org.openqa.selenium.*;

import java.time.*;

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
        getInteractableElement(locator).press(Keys.chord(Keys.CONTROL, "a")).append(s);
        $(LOAD_SPINNER).shouldBe(Condition.visible, Duration.ofSeconds(5))
                .shouldBe(Condition.disappear, Duration.ofSeconds(5));
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
