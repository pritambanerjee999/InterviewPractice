package com.thread.example;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadDemoUsingRunnable t1 = new ThreadDemoUsingRunnable("MyFirstThread");
		t1.start();
		ThreadDemoUsingRunnable t2 = new ThreadDemoUsingRunnable("MySecondThread");
		t2.start();
	}

}
