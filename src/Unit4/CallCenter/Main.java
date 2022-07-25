package Unit4.CallCenter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        PBX pbx = new PBX();
        CallCenter callCenter = new CallCenter(pbx);

        ExecutorService executorService = Executors.newFixedThreadPool(30);

        executorService.submit(pbx::generateCalls);
        while (!executorService.isTerminated()) {
            executorService.submit(callCenter::receiveCall);
        }

        executorService.awaitTermination(30, TimeUnit.SECONDS);

        System.out.println("Call center is closed for today!");
    }
}
