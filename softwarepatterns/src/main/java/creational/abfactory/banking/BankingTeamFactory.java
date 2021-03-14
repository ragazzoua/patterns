package creational.abfactory.banking;

import creational.abfactory.Developer;
import creational.abfactory.ProjectManager;
import creational.abfactory.ProjectTeamFactory;
import creational.abfactory.Tester;

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
