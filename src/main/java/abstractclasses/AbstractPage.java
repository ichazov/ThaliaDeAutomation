package abstractclasses;

import lombok.*;

@Builder
@AllArgsConstructor
public class AbstractPage {

    private String pageUrl;

    private String pageUrlPattern;

    protected AbstractPage() {
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrlPattern(String pageUrlPattern) {
        this.pageUrlPattern = pageUrlPattern;
    }

    public String getPageUrlPattern() {
        return pageUrlPattern;
    }
}
