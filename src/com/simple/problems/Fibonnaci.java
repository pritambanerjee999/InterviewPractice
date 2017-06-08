package com.simple.problems;

public class Fibonnaci {
	// Output = 0 1 1 2 3 5 8 13
	
	public static void main(String args[]){
		int num = 20;
		
		int fibSeries[] = fib(num);
		
		for (int i = 0; i < fibSeries.length; i++){
			System.out.println(fibSeries[i]);
		}
		
		int fibSeriesRec[] = fibByRec(num);
		
		for (int i = 0; i < fibSeriesRec.length; i++){
			System.out.println(fibSeriesRec[i]);
		}
		
	}
	
	public static int[] fibByRec(int num){
		int fib[] = new int[num];
		
		for (int i = 0 ; i < num; i ++){
			fib[i] = fibRec(i);
		}
		
		return fib;
	}
	
	public static int[] fib(int num){
		
		int fib[] = new int[num];
		
		for(int i = 0; i < num; i ++){
			if ( i == 0){
				fib[i] = i;
				continue;
			}
			
			if ( i == 1 || i == 2){
				fib[i] = 1;
				continue;
			}
			
			fib[i] = fib[i-1] + fib [i - 2]; 
			
		}
		
		return fib;
	}
	
	public static int fibRec(int num){
		if(num == 0){
			return 0;
		}
		else if (num == 1 || num == 2){
			return 1;
		}else {
			return fibRec(num -1 ) + fibRec(num - 2);
		}
	}

}
