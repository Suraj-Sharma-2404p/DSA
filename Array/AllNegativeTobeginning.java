package dsaSheetArray;

import java.util.Arrays;

public class AllNegativeTobeginning {
	
	static void swap(int[] arr, int start , int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	static void sort(int[] arr) {
		int i =0;
		int j=0;
		while(i < arr.length) {
			if(arr[i] > 0) {
				i++;
			}else {
				swap(arr, j, i);
				i++;
				j++;
			}
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
