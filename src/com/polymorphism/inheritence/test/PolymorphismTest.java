package com.polymorphism.inheritence.test;

public class PolymorphismTest {

	public static void main(String args[]){
		Parent parent = new Parent();
		
		Parent childOne = new ChildOne();
		
		Parent childTwo = new ChildTwo();
		
		ChildTwo c2 = new ChildTwo();
		
		parent = childOne;
		parent.getMyName();
		
		childOne = childTwo;
		
		childOne.getMyName();
		
		
		parent = childTwo;
		
		parent.getMyName();
		
		parent = childOne;
		
		parent.getMyName();
		
	}
	
}
