package Unit1.JavaBasics.AbstractionsAndInterfaces;

public class fromArchivedStatusMover extends BookMover {
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (requestedStatus == Status.BORROWED || requestedStatus == Status.OVERDUED) {
            System.out.println("Transfer impossible!");
        } else {
            book.status = requestedStatus;
            System.out.println("New status: " + requestedStatus + ".");
        }
    }
}
