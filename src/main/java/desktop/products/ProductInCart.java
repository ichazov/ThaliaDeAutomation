package desktop.products;

import lombok.*;
import org.openqa.selenium.*;

@Builder
@RequiredArgsConstructor
public class ProductInCart {

    @Getter
    private static final By PRODUCT_TITLE_AND_LINK_LOCATOR = By.className("artikel-titel");

    @Getter
    private final String title;
}
