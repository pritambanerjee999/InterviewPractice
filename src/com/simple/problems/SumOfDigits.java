package com.simple.problems;

public class SumOfDigits {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int num = 388;
        int numOfDigits[] = calculateNumberOfDigits(num) ;


        while (numOfDigits.length>1){
            int sum = 0;
            for (int i = 0; i < numOfDigits.length; i++){
                sum = sum + numOfDigits[i];
            }
            System.out.println(sum);
            if(sum < 10){
                break;
            }
            numOfDigits = calculateNumberOfDigits(sum);
        }

    }

    public static int[] calculateNumberOfDigits(int num){
        System.out.println(num);
        int numOfDigits = 0;
        int digits[] = new int[100];
        while(num>0){
            digits[numOfDigits] = num%10;
            System.out.println("Digits = " + digits[numOfDigits]);
            num = num/10;
            numOfDigits = numOfDigits +1;
        }

        return digits;
    }

}
