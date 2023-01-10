package dsaSheetArray;

import java.util.Arrays;

public class Arrange0and1 {
	
	static void swap(int[] arr, int first, int second) {
		int temp =  arr[first] ;
		 arr[first] = arr[second];
		 arr[second] = temp;
	}
	
	static void sort01(int[] arr){
		int i =0;
		int j =0;
		while(i < arr.length) {
			if(arr[i] == 1) {
				i++;
			}else {
				swap(arr,i,j);
				i++;
				j++;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 1,0, 0, 0, 1 };
		//Arrays.sort(arr);
		sort01(arr);
		System.out.println(Arrays.toString(arr));
	}

}
