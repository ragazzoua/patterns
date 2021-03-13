package builder;

public class WebSiteBuilder {
    public static void main(String[] args) {
        WebSite webSite = new WebSite();

        webSite.setName("Visit card");
        webSite.setCms("Wordpress");
        webSite.setPrice(500);

        System.out.println(webSite);

    }
}
