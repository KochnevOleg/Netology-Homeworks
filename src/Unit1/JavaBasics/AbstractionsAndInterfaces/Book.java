package Unit1.JavaBasics.AbstractionsAndInterfaces;

public class Book {
    public String name;
    public Status status;

    public Book(String name) {
        this.name = name;
        status = Status.AVAILABLE;
    }

    public void getStatus() {
        System.out.println("This book is " + status + ".");
    }
}
