package com.collections.iterate.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

public class IterateSet {

	public static void main(String[] args) {
		
		//example Set
		Set<String> set = new HashSet<>();
		
		set.add("Jack");
		set.add("John");
		set.add("Joe");
		set.add("Josh");
		
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		
		//using iterator
		System.out.println("Using Iterator");
		startTime = System.nanoTime();
		Iterator<String> setIterator = set.iterator();
		while(setIterator.hasNext()){
			System.out.println(setIterator.next());
		}
		endTime = System.nanoTime();
		long durationIterator = (endTime - startTime);
		
		
		//using lambda
		System.out.println("Using Lambda");
		startTime = System.nanoTime();
		set.forEach((s) -> System.out.println(s));
		endTime = System.nanoTime();
		long durationLambda = (endTime - startTime);
		
		
		//using Stream API
		System.out.println("Using Stream API");
		startTime = System.nanoTime();
		set.stream().forEach((s) -> System.out.println(s));
		endTime = System.nanoTime();
		long durationStreamAPI = (endTime - startTime);
		
		
		//using Split Iterator (not recommended)
		System.out.println("Using Split Iterator");
		startTime = System.nanoTime();
		Spliterator<String> splitIterator = set.spliterator();
		splitIterator.forEachRemaining((s) -> System.out.println(s));
		endTime = System.nanoTime();
		long durationSplitIterator = (endTime - startTime);
		
		
		//time calculations
		System.out.println("Iterator Duration:" + durationIterator);
		System.out.println("Lamda Duration:" + durationLambda);
		System.out.println("Stream API:" + durationStreamAPI);
		System.out.println("Split Iterator:"+ durationSplitIterator);
	}
}
