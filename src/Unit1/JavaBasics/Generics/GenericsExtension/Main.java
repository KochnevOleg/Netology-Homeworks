package Unit1.JavaBasics.Generics.GenericsExtension;

public class Main {
    public static void main(String[] args) {
        Box<String, Apple> appleBox = new Box<>("Apple", new Apple());
        appleBox.getType().printClass();

        Box<String, Banana> bananaBox = new Box<>("Banana", new Banana());
        bananaBox.getType().printClass();

        Box<String, Fruit> fruitBox = new Box<>("Fruit", new Fruit());
        fruitBox.getType().printClass();

        Box<String, Cabbage> cabbageBoxBox = new Box<>("Cabbage", new Cabbage());
        cabbageBoxBox.getType().printClass();


    }
}
