package com.design.patterns.singleton;

public class SingletonClass {
	
	private static SingletonClass singletonObj;
	
    private SingletonClass(){
		
	}
    
    public static SingletonClass getSingletonClass(){
    	if (singletonObj == null){
    		return new SingletonClass();
    	}
    	else{
    		System.out.println("No more Objects can be created");
    		return null;
    	}
    }

}
