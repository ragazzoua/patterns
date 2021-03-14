package creational.abfactory;

import creational.abfactory.banking.BankingTeamFactory;

public class SuperBankProject {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager manager = projectTeamFactory.getManager();

        System.out.println("Creating bank system");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
