package com.careercup.string;

/*
 * *
 * You have a string aaabbdcccccf, transform it the following way => a3b2d1c5f1 
 * ie: aabbaa -> a2b2a2 not a4b2
 * 
 */


public class PrintCharsWithRepeatation {
    
    public static void main(String args[]){
       // String str = "aaabbdcccccf";
        String str = "jaabbdddaaaaaafffe";
        StringBuilder result = new StringBuilder();
      //  result.append(str.charAt(0));
        int count = 1;
        for(int i = 1; i< str.length(); i++){
            Character currentCharacter = str.charAt(i);
            Character previousCharacter = str.charAt(i-1);
            if(currentCharacter == previousCharacter){
                count = count + 1;
            }else{
                result.append(previousCharacter);
                result.append(count);
                count = 1;
            }
        }
        if(str.charAt(str.length() - 1) != str.charAt(str.length() - 2)){
            result.append(str.charAt(str.length() - 1));
            result.append(1);
        }
        System.out.println(result.toString());
    }
}
