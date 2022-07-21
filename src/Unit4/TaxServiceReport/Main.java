package Unit4.TaxServiceReport;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.LongAdder;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService shops = Executors.newFixedThreadPool(3);
        LongAdder dailyReport = new LongAdder();

        for (int i = 0; i < 2; i++) {
            shops.submit(() -> dailyReport.add(new Shop().generateEarnings()));
        }

        shops.awaitTermination(3, TimeUnit.SECONDS);
        System.out.println("Daily result is: " + dailyReport);
    }
}
