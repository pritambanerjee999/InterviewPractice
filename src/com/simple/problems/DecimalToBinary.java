package com.simple.problems;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int digit = 69;
		
		String binaryNum = "";
		while(true){
			int remainder = digit%2;
			System.out.println("Remainder: " + remainder);
			digit = digit/2;
			System.out.println("Quotient: " + digit);
			binaryNum = String.valueOf(remainder) + binaryNum;
			// quotient = digit/2;
			if(digit<1){
			  break;
			}
		}		
		System.out.println(binaryNum);
	}

}
