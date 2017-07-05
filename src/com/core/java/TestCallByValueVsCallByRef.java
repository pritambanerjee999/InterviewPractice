package com.core.java;

public class TestCallByValueVsCallByRef {

    public static void main(String args[]){
        int array[] = {1, 2, 3 ,4};

        int a = 20;
        int c = a;
        c = 30;
        
     
        
        A aObj = new A();
        
        A aObjectTwo = aObj;
        A objectThree = aObjectTwo;
        A objectClone = new A(aObj);
        aObjectTwo.a = "I am B";
        
        System.out.println(aObj.a);
        System.out.println(objectClone.a);


       // changeValue(array[0], array);

     //   System.out.println( array[0] + "," + array[2]);
    }

    public static void changeValue(int i, int[] arr){
        i = 10;
        arr[2] = 52;
    }


    public void testingOverLoad(){
        System.out.println("Overload");
    }



}
