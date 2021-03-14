package creational.abfactory;

import creational.abfactory.website.WebSiteTeamFactory;

public class AuctionProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager manager = projectTeamFactory.getManager();

        System.out.println("Creating auction system");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
