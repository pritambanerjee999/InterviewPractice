package com.string.problems;

public class ReverseStringUsingRecursionAndForLoop {

    public static void main(String args[]){
        System.out.println(reverseStringUsingForLoop("Reverse"));
        System.out.println(reverseStringUsingForLoop(null));
        System.out.println(reverseUsingRecursion("Something"));
    }
    
    public static String reverseStringUsingForLoop(String str){
        if(null == str || "".equals(str)){
            return "";
        }
        
        int length = str.length();
        char returnChar[] = new char[length];
        
        for(int i = 0; i < length; i++){
            returnChar[length - 1 - i] = str.charAt(i); 
        }
        
        String retString = new String(returnChar);
        return retString;
    }
    
    public static String reverseUsingRecursion(String str){
        if(str.length() == 0){
            return str;
        }
        
        if(str.length() == 1){
            return str;
        }
        
       String reverseString = reverseUsingRecursion(str.substring(1)) + str.charAt(0); 
       return reverseString;          
    }
}
