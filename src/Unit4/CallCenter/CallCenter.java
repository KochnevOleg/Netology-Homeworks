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

        Call call = pbx.getCalls().poll();
        if (call != null) {
            System.out.println("Request from user " + call + " is handled.");
        }
    }
}
