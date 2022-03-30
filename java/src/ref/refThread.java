package ref;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

class ThreadWithClass extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName()); // 현재 실행 중인 스레드의 이름을 반환함.
            try {
                Thread.sleep(10);          // 0.01초간 스레드를 멈춤.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadWithRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()); // 현재 실행 중인 스레드의 이름을 반환함.
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class refThread {
    public static void main(String[] args) {
        ThreadWithClass thread1 = new ThreadWithClass();
        Thread thread2 = new Thread(new ThreadWithRunnable());

        thread1.start();
        thread2.start();


    }
}
