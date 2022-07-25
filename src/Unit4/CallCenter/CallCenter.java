package Unit4.CallCenter;

public class CallCenter {

    private PBX pbx;
    private static final int RECEIVE_TIME = 3000;

    public CallCenter(PBX pbx) {
        this.pbx = pbx;
    }

    public void receiveCall() {
        System.out.println("Response for user " + pbx.getCalls().peek() + "...");
        try {
            Thread.sleep(RECEIVE_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!pbx.getCalls().isEmpty()) {
            System.out.println("Request from user " + pbx.getCalls().peek() + " is handled.");
            pbx.getCalls().poll();
        }
    }
}
