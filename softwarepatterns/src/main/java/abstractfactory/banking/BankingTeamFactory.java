package abstractfactory.banking;

import abstractfactory.Developer;
import abstractfactory.ProjectManager;
import abstractfactory.ProjectTeamFactory;
import abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    public Tester getTester() {
        return new QaTester();
    }

    public ProjectManager getManager() {
        return new BankingPM();
    }
}
