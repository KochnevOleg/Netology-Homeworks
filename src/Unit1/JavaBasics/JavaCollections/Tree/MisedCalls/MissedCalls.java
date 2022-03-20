package Unit1.JavaBasics.JavaCollections.Tree.MisedCalls;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {
    Map<LocalDateTime, Integer> mapOfCalls = new TreeMap<>();

    public void addMissedCall(Integer phoneNumber) {
        mapOfCalls.put(LocalDateTime.now(), phoneNumber);
    }


    public void printMissedCalls(PhoneBook phoneBook) {
        for (Map.Entry<LocalDateTime, Integer> missedCall : mapOfCalls.entrySet()) {
            Contact contactToFind = phoneBook.getContactByPhoneNumber(missedCall.getValue());
            if (contactToFind != null) {
                System.out.println("Time: " + missedCall.getKey() + ", contact: " + contactToFind.getName());
            } else {
                System.out.println("Time: " + missedCall.getKey() + ", contact: " + missedCall.getValue());
            }
        }
    }
}

