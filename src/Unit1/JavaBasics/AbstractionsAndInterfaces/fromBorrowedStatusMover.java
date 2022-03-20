package Unit1.JavaBasics.AbstractionsAndInterfaces;

public class fromBorrowedStatusMover extends BookMover {
    protected void moveToStatus(Book book, Status requestedStatus) {
        book.status = requestedStatus;
        System.out.println("New status: " + requestedStatus + ".");
    }
}
