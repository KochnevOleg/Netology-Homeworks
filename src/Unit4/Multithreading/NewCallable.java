package Unit4.Multithreading;

import java.util.Random;
import java.util.concurrent.Callable;

public class NewCallable<T> implements Callable<Integer> {
    private String name;

    public NewCallable(String name) {
        this.name = name;
    }

    @Override
    public Integer call() throws Exception {
        int counter = 0;
        for (int i = 0; i < new Random().nextInt(10); i++) {
            System.out.printf("This is %s. Hi everybody\n", name);
            counter++;
            Thread.sleep(1500);
        }
        return counter;
    }
}
