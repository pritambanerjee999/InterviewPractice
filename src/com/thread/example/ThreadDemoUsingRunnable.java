package com.thread.example;

public class ThreadDemoUsingRunnable implements Runnable {

	private Thread t;
	private String threadName;
	
	ThreadDemoUsingRunnable(String threadName){
		this.threadName = threadName;
		System.out.println("Creating Thread" + threadName);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Running " +  threadName );
	      try {
	         for(int i = 200; i > 0; i--) {
	            System.out.println("Thread: " + threadName + ", " + i);
	            // Let the thread sleep for a while.
	            Thread.sleep(50);
	         }
	      }catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	}
	
	public void start(){
		System.out.println("Starting New Thread" + threadName);
		if (t == null){
			t = new Thread(this, threadName);
			t.start();
		}
		
		
	}
	
}
