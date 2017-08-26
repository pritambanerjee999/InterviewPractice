package com.thread.example.synchronization;

public class ThreadRunnerTest {

    public static void main(String[] args) {
        Thread tr1 = new Thread(new ThreadRunner());
        Thread tr2 = new Thread(new ThreadRunner());

        tr1.start();
        tr2.start();

        try {
            tr1.join();
            tr2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(ThreadRunner.counter);

    }

}
