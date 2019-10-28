package Lesson24_ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ProdCons wn = new ProdCons();

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

class ProdCons {
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10;
    private final Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (lock) {
                while(queue.size() == LIMIT) {
                    lock.wait();
                }
                queue.offer(value++);
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (lock) {
                while (queue.size() == 0) {
                    lock.wait();
                }
                int value = queue.poll();
                System.out.println(value);
                System.out.println("Q size is = " + queue.size());
                lock.notify();
            }
         Thread.sleep(1000);
        }
    }
}
