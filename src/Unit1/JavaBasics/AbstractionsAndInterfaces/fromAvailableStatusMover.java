package Unit1.JavaBasics.AbstractionsAndInterfaces;

public class fromAvailableStatusMover extends BookMover {
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (requestedStatus == Status.OVERDUED) {
            System.out.println("Transfer impossible!");
        } else {
            book.status = requestedStatus;
            System.out.println("New status: " + requestedStatus + ".");
        }
    }
}
