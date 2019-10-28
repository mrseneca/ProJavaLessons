package Lesson22_WaitAndNotify;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InterruptedException {
    WaitAndNotify wn = new WaitAndNotify();

    Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                wn.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });
    Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                wn.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });

    t1.start();
    t2.start();

    t1.join();
    t2.join();
    }
}

class WaitAndNotify {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread started...");
            wait(); // 1: отдаем intrinsic lock, 2- ждем пока будет вызван notify
            System.out.println("Producer thread resumed...");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);
        synchronized (this) {
            System.out.println("Waiting for return key...");
            scanner.nextLine();
            notify();

            Thread.sleep(2000);
        }
    }
}
