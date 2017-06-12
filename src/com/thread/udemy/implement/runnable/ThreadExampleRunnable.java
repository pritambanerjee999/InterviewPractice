package com.thread.udemy.implement.runnable;

public class ThreadExampleRunnable {
	
	public static void main(String pritam[]){
		Thread t1 = new Thread(new Runner());
		Thread t2 = new Thread(new Runner());
		
		t1.start();
		t2.start();
		
	}

}
