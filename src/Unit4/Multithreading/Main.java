package Unit4.Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ThreadGroup group = new ThreadGroup("group");

        System.out.println("Creating threads...");
        new NewThread(group, "thread 1").start();
        new NewThread(group, "thread 2").start();
        new NewThread(group, "thread 3").start();
        new NewThread(group, "thread 4").start();
        new NewThread(group, "thread 5").start();

        Thread.sleep(15000);

        group.interrupt();
        System.out.println("Interrupting threads...");

        ////////////////task2////////////////////////

        ExecutorService es = Executors.newFixedThreadPool(5);

        List<Callable<Integer>> listOfTasks = new ArrayList<>();
        listOfTasks.add(new NewCallable<>("thread 1"));
        listOfTasks.add(new NewCallable<>("thread 2"));
        listOfTasks.add(new NewCallable<>("thread 3"));
        listOfTasks.add(new NewCallable<>("thread 4"));
        listOfTasks.add(new NewCallable<>("thread 5"));

        es.invokeAll(listOfTasks);

        if (es.isTerminated()) {
            es.shutdown();
        }
        System.out.println("The fastest task iterated: " + es.invokeAny(listOfTasks) + " times.");
    }
}
