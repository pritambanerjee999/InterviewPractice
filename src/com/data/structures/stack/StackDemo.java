package com.data.structures.stack;

public class StackDemo {
	
	public static void main(String args[]){
		Stack s1 = new Stack(10);
		
		s1.push(12);
		s1.push(101);
		
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		
	}

}
