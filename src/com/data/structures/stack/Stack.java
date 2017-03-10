package com.data.structures.stack;

public class Stack {
	
	private Integer data;
	private Integer count;
	private Integer arr[];
	
	Stack(Integer data){
		this.data = data;
		this.count = 1;
		this.arr = new Integer[2];
	}
	
	public boolean isEmpty(){
		if (count == 0){
			return true;
		}else {
			return false;
		}
	}
	
	public void push(Integer data){
		arr[count] = data;
		count = count +1;
		if (count == arr.length){
			resizeArray();
		}
	    
	}
	
	public Integer pop(){
		Integer popData = arr[count-1];
		count = count -1;
		return popData;
	}
	
	private void resizeArray(){
		Integer newArray[] = new Integer[arr.length*2];
		for(int i = 0; i < arr.length; i++){
			newArray[i] = arr[i];
		}
		arr= newArray;
	}
	
	
	
}
