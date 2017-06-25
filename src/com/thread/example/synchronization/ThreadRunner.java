package com.thread.example.synchronization;

public class ThreadRunner extends Thread{

	public static int counter = 0;
	@Override
	public void run(){
		for (int i = 0; i < 10000; i++){
			System.out.println("I am thread:" + i);
			 increaseCounter();
		}
	}
	
	public synchronized void increaseCounter(){
		counter = counter+1;
	}
}
