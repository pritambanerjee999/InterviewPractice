package com.thread.producer.consumer;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {

    public static Integer LIMIT = 10;
    private List<Integer> list = new ArrayList<>();
    private Object lock = new Object();

    public void produce() throws InterruptedException {

        int count = 0;
        while (true) {
            synchronized (this) {
                while (LIMIT == list.size()) {
                    lock.wait();
                }
                list.add(count);
                lock.notify();
            }
        }

    }

    public void consume() throws InterruptedException {

        while (true) {
            synchronized (this) {
                while (list.size() == 0) {
                    lock.wait();
                }
                int value = list.remove(0);
                System.out.println("Value consumed:" + value);
                lock.notify();

            }

        }

    }
    
    

}
