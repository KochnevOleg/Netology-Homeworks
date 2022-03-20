package Unit1.JavaBasics.Generics.GenericsExtension;

public class Box <K, T extends Fruit>{

    private K key;
    private T type;

    public Box(K key, T type){
        this.key = key;
        this.type = type;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public String toString() {
        return "Box{" +
                "key=" + key +
                ", type=" + type +
                '}';
    }
}
