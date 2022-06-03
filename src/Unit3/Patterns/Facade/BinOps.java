package Unit3.Patterns.Facade;

public class BinOps {
    public String sum(String a, String b) {
        return String.valueOf(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }

    public String mult(String a, String b) {
        return String.valueOf(Integer.parseInt(a, 2) * Integer.parseInt(b, 2));
    }
}