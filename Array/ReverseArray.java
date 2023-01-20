package Array;

import java.util.Arrays;

public class ReverseArray {
	
	static void swap(int[] arr , int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void reverseArray(int[] arr, int start , int end) {
		while(start <= end) {
			swap(arr, start, end);
			start++;
			end--;
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6};
		reverseArray(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
