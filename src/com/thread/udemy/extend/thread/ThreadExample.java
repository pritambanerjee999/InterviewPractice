package com.thread.udemy.extend.thread;


public class ThreadExample {
	
	public static void main(String...strings){
		Thread t1 = new Thread(new Runner());
		Thread t2 = new Thread(new Runner());
		
		t1.run();
		t2.run();
	}
	

}
