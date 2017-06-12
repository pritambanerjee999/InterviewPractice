package com.core.java;

public class TestCallByValueVsCallByRef {
	
	public static void main(String args[]){
		int array[] = {1, 2, 3 ,4};
		
		changeValue(array[0], array);
		
		System.out.println( array[0] + "," + array[2]);
	}
	
	public static void changeValue(int i, int[] arr){
		i = 10;
		arr[2] = 52;
	}
	
	
	public void testingOverLoad(){
		System.out.println("Overload");
	}
	
	

}
