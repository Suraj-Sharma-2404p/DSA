package algortithms;

import java.util.Arrays;

public class SearchIn2DArray {
	public static void main(String[] args) {
		int[][] arr = { { 22, 27, 12 }, { 16, 79, 41, 6 }, { 78, 21, 4, 45 }, { 18, 20, 23 } };
		int target = 21;
		int[] ans = search(arr,target);
		System.out.println(Arrays.toString(ans));
		System.out.println(maxIn2D_Array(arr));
	}

	private static int[] search(int[][] arr, int target) {
		for(int row = 0 ; row< arr.length;row++) {
			for(int col = 0 ; col<arr[row].length;col++) {
				if(arr[row][col]== target) {
					return new int[] {row,col};
				}
			}
		}
		return new int[] {-1,-1};
	}
	
	private static int maxIn2D_Array(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int[] row : arr) {
			for (int element : row) {
				if(element > max) {
					max = element;
				}
			}
			
		}
		return max;
	}
}