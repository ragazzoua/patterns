package structural.bridge;

public class BankSystem extends Program {

    public BankSystem(Developer developer) {
        super(developer);
    }

    public void developProgram() {
        System.out.println("bank system development is in progress");
        developer.writeCode();
    }
}
