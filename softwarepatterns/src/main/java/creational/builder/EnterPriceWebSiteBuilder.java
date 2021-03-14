package creational.builder;

public class EnterPriceWebSiteBuilder extends WebsiteBuilder {
    void buildName() {
        webSite.setName("Enterprice site");
    }

    void buildCms() {
        webSite.setCms(Cms.ALIFRESCO);
    }

    void buildPrice() {
        webSite.setPrice(1000);
    }
}
