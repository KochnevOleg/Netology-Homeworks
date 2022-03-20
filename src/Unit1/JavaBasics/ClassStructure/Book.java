package Unit1.JavaBasics.ClassStructure;

public class Book {
    String name;
    Author author;
    int dateOfWriting;
    int numberOfPages;

    public Book(String name, Author author, int dateOfWriting, int numberOfPages) {
        this.name = name;
        this.author = author;
        this.dateOfWriting = dateOfWriting;
        this.numberOfPages = numberOfPages;
    }

    public String toString() {
        return name + ", " + dateOfWriting + ", " + numberOfPages + ".";
    }

    public void describeShort() {
        System.out.println(name + " was written by " + author + " in " + dateOfWriting + " and consist about " + numberOfPages + " pages");
        System.out.println("");
    }

    public void describeLong() {
        System.out.println("'The Grapes of Wrath' is an American realist novel written by " + author + " and published in " + dateOfWriting + "." +
                " \nThe book won the National Book Award and Pulitzer Prize for fiction, and it was cited prominently when" +
                " \nSteinbeck was awarded the Nobel Prize in 1962.");
        System.out.println("");
    }
}