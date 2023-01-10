package algortithms;

import java.util.Arrays;

public class SortingAlgorithms {

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	static void bubbleSort(int[] arr) {
		boolean swapped;
		for (int itr = 1; itr <= arr.length-1 ; itr ++) {
			swapped = false;
			for (int j = 0 ; j < arr.length - itr; j++) {
				if (arr[j+1] < arr[j]) {
					swap(arr, j+1, j);
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}

		}
	}

	static void selectionSort(int arr[] ) {
		
		for(int i = 0 ; i < arr.length-1 ; i++) {
			int minIndex = i;
			for(int j= i+1 ; j< arr.length ; j++) {
				if(arr[j]<arr[minIndex]){
					minIndex = j;
				}
			}
			swap(arr, i, minIndex);
		}
		
	}
	
	static void insertionSort(int[] arr) {
		for(int i =1 ; i < arr.length; i++) {
			int current = arr[i];
			int j = i-1;
			while (j >= 0 && current < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
	}

	

	public static void main(String[] args) {
		int[] arr = {-1,-5,9,2,5};
		 //bubbleSort(arr);
		//selectionSort(arr);
		insertionSort(arr);
		
		System.out.println(Arrays.toString(arr));
		// System.out.println(getMaximumIndex(arr, 0, arr.length));
		// System.out.println(getMaxIndex(arr, 0));

	}

}
