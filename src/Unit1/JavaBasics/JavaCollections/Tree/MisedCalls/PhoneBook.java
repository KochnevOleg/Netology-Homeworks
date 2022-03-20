package Unit1.JavaBasics.JavaCollections.Tree.MisedCalls;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    protected HashMap<String, List<Contact>> phoneBook = new HashMap<>();

    public boolean addGroup(String name) {
        if (phoneBook.containsKey(name)) {
            return false;
        }
        List<Contact> contacts = new ArrayList<>();
        phoneBook.put(name, contacts);
        return true;
    }

    public void addContactToGroup(String group, Contact contact) {
        this.phoneBook.get(group).add(contact);
    }

    public Contact getContactByPhoneNumber(int phoneNum) {
        Contact contactToSearch = null;
        for (List<Contact> group : this.phoneBook.values()) {
            for (Contact contact : group) {
                if (contact.getPhoneNumber() == phoneNum) {
                    contactToSearch = contact;
                }
            }
        }
        return contactToSearch;
    }
}
