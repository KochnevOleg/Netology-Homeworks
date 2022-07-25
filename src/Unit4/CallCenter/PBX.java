package Unit4.CallCenter;

import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

public class PBX {

    private ConcurrentLinkedQueue<Call> calls;
    private static final int CALLS_TIMEOUT = 10000;

    public PBX() {
        calls = new ConcurrentLinkedQueue<>();
    }

    public void generateCalls() {
            while (true) {
                for (int i = 0; i < 45; i++) {
                    Call call = new Call(new Random().nextInt(100000));
                    System.out.println("New request from user " + call.getId() + ".");
                    calls.add(call);
                }
                try {
                    Thread.sleep(CALLS_TIMEOUT);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    public ConcurrentLinkedQueue<Call> getCalls() {
        return calls;
    }
}
