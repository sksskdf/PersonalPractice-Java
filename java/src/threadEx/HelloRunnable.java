package threadEx;

public class HelloRunnable implements Runnable{

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        String hellomsg = String.format("Hello i'm %s", threadName);
        System.out.println(hellomsg);
    }
}
