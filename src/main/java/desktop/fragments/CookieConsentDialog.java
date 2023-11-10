package desktop.fragments;

import abstractclasses.*;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selenide.$;

public class CookieConsentDialog extends AbstractFragment {

    private static final By SHADOW_ROOT = By.xpath("//div[@id='usercentrics-root']");

    private static final By ACCEPT_NECESSARY_COOKIES_BUTTON = By.cssSelector("[data-testid='uc-deny-all-button']");

    public CookieConsentDialog() {
        setRootElement(SHADOW_ROOT);
    }

    public void acceptNecessaryCookies() throws InterruptedException {
        //OH NO!!! THREAD SLEEP 0_0. Refactor to use fluent wait!
        Thread.sleep(3000);
        $(SHADOW_ROOT).getShadowRoot()
                .findElement(ACCEPT_NECESSARY_COOKIES_BUTTON)
                .click();
    }
}
