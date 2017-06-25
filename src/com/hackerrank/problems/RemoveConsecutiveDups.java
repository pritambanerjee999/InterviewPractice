package com.hackerrank.problems;

import java.util.*;

public class RemoveConsecutiveDups {

    static String result = "";
    static String resultTrim = "";
    
    static String super_reduced_string(String s){
        
//        if(s.equals(result)){
//            return s;
//        }
          
        if(s.length() == 0 || s.length() == 1){
            return s;
        }
        
        if(s.length() == 2){
           if (s.charAt(0) != s.charAt(1)){
                return s;
           }else{
               return "Empty String";
           }
           
        }
                
        char arr[] = new char[1000];
        int index = 0;
        for(int i = 0; i < s.length()-2; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                if((s.charAt(i) == s.charAt(i+1)) && (s.charAt(i + 1) == s.charAt(i+2))){
                   arr[index] = s.charAt(i);
                   index = index + 1;
                   i = i + 2;
               }else{
                    i = i+1;
               }
            }
            else{
                arr[index] = s.charAt(i);
                index = index + 1;
            }
        }
        
         if(s.charAt(s.length() -2) != s.charAt(s.length() - 3)){
            arr[index] = s.charAt(s.length()-2);
             index++;
        }
        
        
        if(s.charAt(s.length() -1) != s.charAt(s.length() - 2)){
            arr[index] = s.charAt(s.length() - 1);
        }
        
        
        String result = String.valueOf(arr);
        result = result.trim();
     //   resultTrim = super_reduced_string(result);
        
        if("".equals(result)){
            return "Empty String";
        }
        
  //      result = super_reduced_string(result);
        
        
        if(result.equals(resultTrim) && !result.equals("Empty String")){
             return result;
        }else{
            resultTrim = super_reduced_string(result);
            result = resultTrim;
        }
        
        return result;
       
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String res = super_reduced_string(s);
        System.out.println(res);
    }
}
