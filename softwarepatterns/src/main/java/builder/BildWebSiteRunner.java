package builder;

public class BildWebSiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setWebsiteBuilder(new VisitCardWebSiteBuilder());
        WebSite webSite = director.buildWebSite();

        System.out.println(webSite);
    }
}
