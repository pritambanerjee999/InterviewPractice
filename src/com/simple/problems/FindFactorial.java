package com.simple.problems;

public class FindFactorial {

    public static void main(String args[]){
        int number = 5;
        System.out.println(findFactorial(number));
    }
    
    public static int findFactorial(int num){
        if(num==1){
            return 1;
        }
        
        if(num == 2){
            return 2;
        }
        
        return (num*findFactorial(num-1));
    }
    
}
