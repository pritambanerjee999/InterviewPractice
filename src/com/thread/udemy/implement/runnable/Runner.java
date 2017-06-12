package com.thread.udemy.implement.runnable;

public class Runner implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++){
			System.out.println("I am thread:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Exception in thread method:");
			}
		}
		
	}

}
