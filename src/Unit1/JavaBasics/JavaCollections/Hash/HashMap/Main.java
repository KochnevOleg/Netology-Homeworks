package Unit1.JavaBasics.JavaCollections.Hash.HashMap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addGroup("Family");
        phoneBook.addGroup("Job");
        phoneBook.addGroup("Friends");

        Contact wife = new Contact("Wife", 123123123);
        Contact mom = new Contact("Mom", 234234234);
        Contact jack = new Contact("Jack", 345345345);
        Contact john = new Contact("John", 456456456);


        phoneBook.addContactToGroup("Family", wife);
        phoneBook.addContactToGroup("Family", mom);
        phoneBook.addContactToGroup("Friends", jack);
        phoneBook.addContactToGroup("Job", jack);
        phoneBook.addContactToGroup("Family", john);
        phoneBook.addContactToGroup("Job", john);

        System.out.println(Arrays.toString(phoneBook.getContactByGroup("Family")));
        System.out.println(phoneBook.getContactByPhoneNumber(345345345));
    }
}
