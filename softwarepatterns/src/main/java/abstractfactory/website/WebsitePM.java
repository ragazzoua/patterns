package abstractfactory.website;

import abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    public void manageProject() {
        System.out.println("WebSitePm manages project");
    }
}
