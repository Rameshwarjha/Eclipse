package com;

public class Three_d_array {

	public static void main(String[] args) {
		// Create a 3d array
		int[][][] test = {
				{
					{1,-2,3},
					{2,3,4},
					{3}
		        },
				{
		        	{-4,-5,6,9},
		        	{1},
		        	{2,3}
				}

	      };
		//for each loop to iterate through elements of 3d array
		
		for(int[][] array2d: test) {
			for(int[] array1d: array2d) {
				for(int item: array1d) {
					System.out.print(item);
				}
				System.out.println();
			}
			System.out.println();
			
		}

}
}
