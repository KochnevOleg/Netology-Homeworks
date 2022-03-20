package Unit1.JavaBasics.JavaCollections.Tree.MisedCalls;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PhoneBook phoneBook = new PhoneBook();
        MissedCalls missedCalls = new MissedCalls();

        phoneBook.addGroup("Main");

        Contact[] contacts = {new Contact("John", 899912345), new Contact("Tom", 899923456), new Contact("Jack", 899934567)};

        for(Contact contact : contacts) {
            phoneBook.addContactToGroup("Main", contact);
        }

        int[] phoneNumbers = {899912345, 899932132, 899934567, 899998787, 899976565, 899923456};

        for (int number : phoneNumbers) {
            missedCalls.addMissedCall(number);
            Thread.sleep(1000);
        }

        missedCalls.printMissedCalls(phoneBook);
    }
}
