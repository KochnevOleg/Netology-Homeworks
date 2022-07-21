package Unit4.UselessBox;

public class User {

    private final Toy toy;

    public User(Toy toy) {
        this.toy = toy;
    }

    public void switchOff() {
        final int SLEEPING_TIME = 2000;
        int counter = 0;
        while (true) {
            if (toy.getSwitcher()) {
                try {
                    Thread.sleep(SLEEPING_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                toy.switchOff();
                counter++;
                System.out.println(Thread.currentThread().getName() + ": switcher is OFF!");

                if (counter == 10) {
                    break;
                }
            }
        }
    }
}
