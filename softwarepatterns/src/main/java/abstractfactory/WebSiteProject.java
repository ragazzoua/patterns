package abstractfactory;

public class WebSiteProject {
    public static void main(String[] args) {
        PhpDeveloper phpDeveloper = new PhpDeveloper();
        ManualTester manualTester = new ManualTester();
        ProjectManager projectManager = new ProjectManager();

        System.out.println("Creating project");
        phpDeveloper.writeCode();
        manualTester.testCode();
        projectManager.manageProject();

    }
}
