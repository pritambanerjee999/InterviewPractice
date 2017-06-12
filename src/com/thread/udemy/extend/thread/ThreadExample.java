package com.thread.udemy.extend.thread;

public class ThreadExample {
	
	public static void main(String pritam[]){
		Runner threadOne = new Runner();
		threadOne.start();
		
		Runner threadTwo = new Runner();
		threadTwo.start();
	}

}
