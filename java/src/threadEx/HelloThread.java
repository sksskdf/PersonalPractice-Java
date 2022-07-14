package threadEx;

public class HelloThread extends Thread {

    @Override
    public void run() {
        String hellomsg = String.format("Hello, i'm %s", getName());
        System.out.println(hellomsg);
    }
}
