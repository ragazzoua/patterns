package creational.builder;

public class Director {
    WebsiteBuilder websiteBuilder;

    public void setWebsiteBuilder(WebsiteBuilder websiteBuilder) {
        this.websiteBuilder = websiteBuilder;
    }

    WebSite buildWebSite() {
        websiteBuilder.createWebSite();
        websiteBuilder.buildName();
        websiteBuilder.buildCms();
        websiteBuilder.buildPrice();
        WebSite webSite = websiteBuilder.getWebSite();
        return webSite;
    }
}
