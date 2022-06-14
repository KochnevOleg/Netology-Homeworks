package Unit4.Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ThreadGroup group = new ThreadGroup("group");


        System.out.println("Creating threads...");
        String[] threads = {"thread 1", "thread 2", "thread 3", "thread 4", "thread 5"};

        for (String thread : threads) {
            new NewThread(group, thread).start();
        }

        Thread.sleep(15000);

        group.interrupt();
        System.out.println("Interrupting threads...");

        ////////////////task2///////////////////////

        Thread.sleep(3000);
        System.out.println("\n\nTask 2 beginning...\n\n");
        Thread.sleep(3000);

        ExecutorService es = Executors.newFixedThreadPool(5);

        List<Callable<Integer>> listOfTasks = new ArrayList<>();

        for (String thread : threads) {
            listOfTasks.add(new NewCallable<>(thread));
        }

        es.invokeAll(listOfTasks);

        if (es.isTerminated()) {
            es.shutdown();
        }
        System.out.println("The fastest task iterated: " + es.invokeAny(listOfTasks) + " times.");
    }
}
