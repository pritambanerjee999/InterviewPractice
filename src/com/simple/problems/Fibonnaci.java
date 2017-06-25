package com.simple.problems;

public class Fibonnaci {
	// Output = 0 1 1 2 3 5 8 13

	static int fibMemo[];
	
	public static void main(String args[]) {
		int num = 20;

		System.out.println("By For Loop");
		Long startTimeForLoop = System.nanoTime();
		// returns the fib series
		int fibSeries[] = fib(num);
		for (int i = 0; i < fibSeries.length; i++) {
			System.out.print(" " + fibSeries[i] + " ");
		}
		Long stopTimeForLoop = System.nanoTime();
		System.out.println("");
		System.out.println("For Loop Time:" + (stopTimeForLoop - startTimeForLoop));

		
		System.out.println("By Using Recursion");
		Long startTimeRecursion = System.nanoTime();
		// uses recursion
		int fibSeriesRec[] = fibByRec(num);


		for (int i = 0; i < fibSeriesRec.length; i++) {
			System.out.print(" " + fibSeriesRec[i] + " ");
		}
		Long stopTimeRecursion = System.nanoTime();
		System.out.println("");
		System.out.println("For Loop Time:" + (stopTimeRecursion -startTimeRecursion));

		
		
		System.out.println("By Using Memoization Technique");
		Long startTimeMemo = System.nanoTime();
		// uses memoization
		fibMemo = new int[num];
		fibByRecMemo(num-1);
		for (int i = 0; i < fibMemo.length; i++) {
			System.out.print(" " + fibMemo[i] + " ");
		}
		Long stopTimeMemo = System.nanoTime();
		System.out.println("");
		System.out.println("Memoization Time:" + (stopTimeMemo - startTimeMemo));

	}

	
	//fib by memoization
	
	public static int fibByRecMemo(int num){
		
		if(num == 0){
			fibMemo[0] = 0;
			return 0;
		}
		
		if(num ==1 || num ==2){
		  fibMemo[num] = 1;
		  return 1;	
		}
		
		if(fibMemo[num] == 0){
			fibMemo[num] = fibByRecMemo(num-1) + fibByRecMemo(num -2);
			return fibMemo[num];
		}else{
			return fibMemo[num];
		}
		   
	}
	
	
	public static int[] fibByRec(int num) {
		int fib[] = new int[num];

		for (int i = 0; i < num; i++) {
			fib[i] = fibRec(i);
		}

		return fib;
	}

	public static int fibRec(int num) {
		if (num == 0) {
			return 0;
		} else if (num == 1 || num == 2) {
			return 1;
		} else {
			return fibRec(num - 1) + fibRec(num - 2);
		}
	}

	public static int[] fib(int num) {
		int fibSum[] = new int[num];
		for (int i = 0; i < num; i++) {
			if (i == 0) {
				fibSum[i] = i;
				continue;
			}

			if (i == 1 || i == 2) {
				fibSum[i] = 1;
				continue;
			}

			fibSum[i] = fibSum[i - 1] + fibSum[i - 2];

		}
		return fibSum;
	}

}
