package Unit1.JavaBasics.Generics.FitstGenerics;

public class Main {
    public static void main(String[] args) {
        Box<String, String> string = new Box<>("String sample1", "String sample2");
        Box<String, Integer> integer = new Box<>("Key", 123);
        Box<Double, Boolean> trueValue = new Box<>(123.456, true);

        System.out.println(string + "\n" + integer + "\n" + trueValue);
    }
}
