package com.interview.hackerrank;

import java.util.*;

public class Solution {

    private static Scanner scanner;

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       String doYouWantToContinue = "yes"; 
       
       while(doYouWantToContinue.equals("yes")){
          scanner = new Scanner(System. in); 
          System.out.println("Enter the number of Elements:");
          String arrSizeString = scanner. nextLine();
          int arrSize = Integer.parseInt(arrSizeString); 
          String[] arr = new String[arrSize];
          Integer sum = 0;
          for (int i = 0; i < arrSize; i++){
              arr[i] = scanner.nextLine();
              sum = sum + Integer.parseInt(arr[i]);
          } 
          System.out.println(sum);   
       }
        
        
    }
}