package com.thread.udemy.extend.thread;

public class Runner extends Thread{
	
	@Override
	public void run(){
		for (int i = 0; i < 10; i++){
			System.out.println("I am thread:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception in thread method:");
			}
		}
		
	}

}
