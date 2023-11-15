package desktop.products;

import com.codeborne.selenide.*;
import lombok.*;
import org.openqa.selenium.*;

@Builder
@RequiredArgsConstructor
public class ProductItemInSearchResultsList {

    @Getter
    private static final By PRODUCT_LINK_LOCATOR = By.className("tm-produkt-link");

    @Getter
    private static final By TITLE_LOCATOR = By.className("tm-artikeldetails__titel");

    @Getter
    private final String title;

    @Getter
    private final SelenideElement productPageLink;

    public void openProductPage() {
        productPageLink.click();
    }
}
