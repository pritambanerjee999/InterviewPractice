package com.interview.arrays;

public class QuickSort {

    public static void main(String args[]){



    }

    public static void quickSort(int[] arr, int low, int high){
        if(arr.length == 1){
            return;
        }
        

        if(arr.length == 2){
            int a = arr[0];
            arr[0] = arr[1];
            arr[1] = a;
        }

        int pivot = low + (high -low)/2;

        int lowIterator = low;
        int highIterator = high;

        while (lowIterator<=highIterator){

            while(arr[pivot] < high){
                lowIterator--;
            }

            while(arr[pivot] > low){
                highIterator++;
            }

            if(arr[highIterator] < arr[lowIterator]){
                int temp = arr[highIterator];
                arr[highIterator] = arr[lowIterator];
                arr[lowIterator] = temp;
            }

        }



    }

}
