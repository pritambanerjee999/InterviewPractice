package com.simple.problems;

public class StringPermutation {
	
	public static void main(String args[]){
		String perm = "Abcd";
		int arr[] = {1,2,3,4}; 
		System.out.println(permutation("",perm));
	}
	
	public static String permutation(String prefix, String perm){
		if(perm.length() == 0){
			System.out.println(prefix);
		}else{
			for (int i = 0; i < perm.length(); i++){
				permutation(prefix + perm.charAt(i), perm.substring(0,i) + perm.substring(i+1));
			}
		}
		return prefix;
	}
	
	
	
}
