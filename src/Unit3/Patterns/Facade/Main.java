package Unit3.Patterns.Facade;

public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();

        System.out.println(binOps.sum("1100", "100010"));
        System.out.println(binOps.mult("10101", "101011"));
    }
}
