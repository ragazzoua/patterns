package builder;

public class VisitCardWebSiteBuilder extends WebsiteBuilder {
    void buildName() {
        webSite.setName("Visit card");
    }

    void buildCms() {
        webSite.setCms(Cms.WORDPRESS);
    }

    void buildPrice() {
        webSite.setPrice(500);
    }
}
