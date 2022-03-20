package Unit1.JavaBasics.JavaCollections.Hash.HashMap;

public class Contact {
    private String name;
    private int phoneNumber;

    public Contact(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String toString() {
        return name + " - " + phoneNumber;
    }
}
