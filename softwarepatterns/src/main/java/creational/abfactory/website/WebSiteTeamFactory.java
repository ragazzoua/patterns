package creational.abfactory.website;

import creational.abfactory.Developer;
import creational.abfactory.ProjectManager;
import creational.abfactory.ProjectTeamFactory;
import creational.abfactory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    public Tester getTester() {
        return new WebSiteManualTester();
    }

    public ProjectManager getManager() {
        return new WebsitePM();
    }
}
