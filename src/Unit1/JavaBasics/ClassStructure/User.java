package Unit1.JavaBasics.ClassStructure;

public class User {
    public static int totalOnline;

    String firstName;
    String lastName;
    String eMail;

    public User(String firstName, String lastName, String eMail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        totalOnline = totalOnline + 1;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}