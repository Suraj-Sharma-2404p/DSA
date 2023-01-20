package algortithms;

import java.util.Arrays;

public class QuickSortShraddha {

	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pidx = partition(arr, low, high);
			quickSort(arr, low, pidx - 1);
			quickSort(arr, pidx + 1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		
		// to find correct position of pivot.
		i++;
		swap(arr, i, high);
		return i;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 3, 9, 5, 2, 8 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

}
