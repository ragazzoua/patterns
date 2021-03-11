package abstractfactory.banking;

import abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    public void manageProject() {
        System.out.println("Pm manages project");
    }
}
