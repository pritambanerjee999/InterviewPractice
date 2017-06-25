package com.expeditor.practice.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		List<Integer> arrOne = new ArrayList<>();
		List<Integer> arrTwo = new ArrayList<>();
		
		Integer i1 = new Integer("10");
		i1 = Integer.valueOf("10");
		
		arrOne.add(10);
		arrOne.add(20);
		arrOne.add(30);
		
		arrTwo.add(100);
		arrTwo.add(20);
		arrTwo.add(300);
		
		List<Integer> mergedArrayWithoutDups = mergeTwoArrays(arrOne, arrTwo);
		
		for(Integer i : mergedArrayWithoutDups){
			System.out.println(i);
		}
		
		
		Set<Integer> s = new HashSet(arrOne);
		
		s.addAll(arrTwo);
		
		
		System.out.println("Hash Set:");
		for(Integer i : s){
			System.out.println(i);
		}
	}
	
	
	public static List<Integer> mergeTwoArrays(List<Integer> arrOne,List<Integer> arrTwo) {
		List<Integer> mergedArrayWithoutDups = new ArrayList<Integer>();
		
		if(arrOne == null ){
			arrOne = new ArrayList<Integer>();
		}
		
		if(arrTwo == null){
			arrTwo = new ArrayList<Integer>();
		}
		
		if(arrOne.size() == 0 && arrTwo.size() == 0){
			return mergedArrayWithoutDups;
		}
		
		if((arrTwo.size() == 0) && (arrOne.size() != 0)){
			return arrOne;
		}
		
		if((arrTwo.size() != 0) && (arrOne.size() == 0)){
			return arrTwo;
		}
		
		for(int i = 0; i < arrOne.size(); i++){
			if(!arrTwo.contains(arrOne.get(i))){
				mergedArrayWithoutDups.add(arrOne.get(i));
			}
		}
		
		for(int i = 0; i < arrTwo.size(); i++){
			mergedArrayWithoutDups.add(arrTwo.get(i));
		}
		
		return mergedArrayWithoutDups;
		
		
	}

}
