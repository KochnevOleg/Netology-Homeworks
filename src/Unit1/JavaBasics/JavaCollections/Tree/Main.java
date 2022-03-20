package Unit1.JavaBasics.JavaCollections.Tree;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PhoneBook phoneBook = new PhoneBook();
        MissedCalls missedCalls = new MissedCalls();

        phoneBook.addGroup("Main");

        phoneBook.addContactToGroup("Main", new Contact("John", 899912345));
        phoneBook.addContactToGroup("Main", new Contact("Tom", 899923456));
        phoneBook.addContactToGroup("Main", new Contact("Jack", 899934567));

        missedCalls.addMissedCall(899912345);
        Thread.sleep(1000);
        missedCalls.addMissedCall(899932132);
        Thread.sleep(1000);
        missedCalls.addMissedCall(899934567);
        Thread.sleep(1000);
        missedCalls.addMissedCall(899998787);
        Thread.sleep(1000);
        missedCalls.addMissedCall(899976565);
        Thread.sleep(1000);
        missedCalls.addMissedCall(899923456);

        missedCalls.printMissedCalls(phoneBook);

    }
}
