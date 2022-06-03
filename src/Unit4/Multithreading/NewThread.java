package Unit4.Multithreading;

public class NewThread extends Thread {

    public NewThread(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
    }


    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                System.out.printf("This is %s. Hi everybody!\n", this.getName());
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
        } finally {
            System.out.printf("%s is interrupted\n", getName());
        }
    }
}
