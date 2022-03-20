package Unit1.JavaBasics.ClassStructure;

public class Author {
    String name;
    int dateOfBirth;

    public Author(String name, int dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return name + " (was born in " + dateOfBirth + ")";
    }
}