package Unit4.UselessBox;

import java.util.concurrent.atomic.AtomicBoolean;

public class Toy {

    private AtomicBoolean switcher;

    public Toy() {
        switcher = new AtomicBoolean();
        switcher.set(true);
    }

    public void switchOff() {
        switcher.set(false);
    }

    public boolean getSwitcher() {
        return switcher.get();
    }

    public void switchOn() {
        while (true) {
            if (!switcher.get()) {
                switcher.set(true);
                System.out.println(Thread.currentThread().getName() + ": switcher is ON!");
            }
        }
    }
}
