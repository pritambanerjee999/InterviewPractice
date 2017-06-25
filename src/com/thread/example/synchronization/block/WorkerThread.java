package com.thread.example.synchronization.block;

import java.util.ArrayList;
import java.util.List;

public class WorkerThread implements Runnable{

	private List<Integer> list1 = new ArrayList<Integer>();
	
	private List<Integer> list2 = new ArrayList<Integer>();
	
	@Override
	public void run() {
		addToListOne();
		addToListTwo();
		
		int i = 0;
		
	}

	public void addToListOne(){
		Double d = Math.random();
		Integer i = d.intValue();
		list1.add(i);
	}
	
	public void addToListTwo(){
		Double d = Math.random();
		Integer i = d.intValue();
		list2.add(i);
	}
}
