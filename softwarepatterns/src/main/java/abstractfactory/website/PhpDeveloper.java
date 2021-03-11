package abstractfactory.website;

import abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    public void writeCode() {
        System.out.println("Php developer writes php code");
    }
}
