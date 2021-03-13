package abstractfactory.website;

import abstractfactory.Developer;
import abstractfactory.ProjectManager;
import abstractfactory.ProjectTeamFactory;
import abstractfactory.Tester;

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
