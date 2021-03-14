package structural.bridge;

public class StockExchange extends Program {

    public StockExchange(Developer developer) {
        super(developer);
    }

    public void developProgram() {
        System.out.println(" stock exchange system development is in progress");
        developer.writeCode();
    }
}
