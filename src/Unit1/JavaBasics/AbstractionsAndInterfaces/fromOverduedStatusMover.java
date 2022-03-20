package Unit1.JavaBasics.AbstractionsAndInterfaces;

public class fromOverduedStatusMover extends BookMover {
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (requestedStatus == Status.BORROWED) {
            System.out.println("Transfer impossible!");
        } else {
            book.status = requestedStatus;
            System.out.println("New status: " + requestedStatus + ".");
        }
    }
}
