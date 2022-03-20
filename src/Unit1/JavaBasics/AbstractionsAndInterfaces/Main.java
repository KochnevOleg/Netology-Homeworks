package Unit1.JavaBasics.AbstractionsAndInterfaces;

public class Main {
    public static void main(String[] args) {
        Book tgow = new Book("The grapes of Wrath");

        BookMover fromAvailableStatusMover = new fromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(tgow, Status.OVERDUED);
        tgow.getStatus();
    }
}
