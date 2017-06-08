package com.arrays.equals;

public class Transpose {

	public static int[][] createPatterned2DArray(int row,int column){
		int width = column;
		int height = row;
		int[][] array = new int[height][width];

		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < width; j++)
			{
				array[i][j] = i + j + (width * i);

			}
		}

		return array;

	}

	public static void main(String[] args) {


		int arr[][] = createPatterned2DArray(3,5);

		for (int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.println(arr[i][j]);
			}
		}


	}

}
