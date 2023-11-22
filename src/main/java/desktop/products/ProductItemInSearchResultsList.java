package desktop.products;

import com.codeborne.selenide.*;
import lombok.*;
import org.openqa.selenium.*;

import java.math.*;

@Builder
@RequiredArgsConstructor
public class ProductItemInSearchResultsList {

    @Getter
    private static final By PRODUCT_LINK_LOCATOR = By.className("tm-produkt-link");

    @Getter
    private static final By TITLE_LOCATOR = By.className("tm-artikeldetails__titel");

    @Getter
    private static final By PRODUCT_FORMAT_LOCATOR = By.className("tm-artikeldetails__formatbezeichnung");

    @Getter
    private static final By PRODUCT_PRICE_LOCATOR = By.cssSelector("[price]");

    @Getter
    private final String title;

    @Getter
    private final String productFormat;

    private final String productPrice;

    @Getter
    private final SelenideElement productPageLink;

    public BigDecimal getProductPrice() {
        return new BigDecimal(productPrice);
    }

    public void openProductPage() {
        productPageLink.click();
    }
}
