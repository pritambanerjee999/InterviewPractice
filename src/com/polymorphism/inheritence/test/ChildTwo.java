package com.polymorphism.inheritence.test;

public class ChildTwo extends Parent{
	
	public ChildTwo(){
		
	}
	
	@Override
	public void getMyName(){
		System.out.println("My name is Child Two");
	}
	
	public void belongToChildTwo(){
		System.out.println("I belong to Child Two only");
	}

}
