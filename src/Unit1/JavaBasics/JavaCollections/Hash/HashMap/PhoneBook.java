package Unit1.JavaBasics.JavaCollections.Hash.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private HashMap<String, List<Contact>> group = new HashMap<>();

    public boolean addGroup(String name)  {
        if (group.containsKey(name)){
            return false;
        }
        List<Contact> contacts = new ArrayList<>();
        group.put(name, contacts);
        return true;
    }

    public void addContactToGroup(String group, Contact contact) {
        this.group.get(group).add(contact);
    }

    public Contact [] getContactByGroup (String groupName) {
        return group.get(groupName).toArray(new Contact[0]);
    }

    public Contact getContactByPhoneNumber(int phoneNum) {
        Contact contactToSearch = null;
        for (List<Contact> group : this.group.values()) {
            for (Contact contact : group) {
                if (contact.getPhoneNumber() == phoneNum){
                    contactToSearch = contact;
                }
            }
        }
        return contactToSearch;
    }
}
