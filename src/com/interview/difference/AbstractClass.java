package com.interview.difference;

public abstract class AbstractClass {

	private int privateInt;
	public static int integerVariable;
	public final int finalIntegerVariable = 20;
	
	//can have constructors
	public AbstractClass(){
		
	}
	
	public int getPrivateInt(){
		return privateInt;
	}
	
	public abstract void noBodyMethod();
	
	
}
