package Unit1.JavaBasics.Generics.FitstGenerics;

public class Box <T, K>{

    private T object;
    private K key;

    public Box(T object, K key){
        this.object = object;
        this.key = key;
    }

    public void setObject(T object){
        this.object = object;
    }

    public T getObject(){
        return object;
    }

    public void setKey(K key){
        this.key = key;
    }

    public K getKey(){
        return key;
    }

    public String toString(){
        return "Box{" + "key=" + key + "; keyType=" + key.getClass().getName() + ", obj=" + object + "; objType=" + object.getClass().getName() + '}';
    }
}
