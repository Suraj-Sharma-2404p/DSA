package algortithms;

import java.util.Arrays;

public class Practice {
	
	static void bubbleSort(int[] arr) {
		
		for (int itr = 0; itr < arr.length; itr++) {
			for (int i = 0; i < arr.length-itr; i++) {
				if (arr[i+1]<arr[i]) {
					swap(arr, i+1, i);
				}
			}
		}
	}
	 static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	public static void main(String[] args) {
		int[] arr = {5,6,1,2,9};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
