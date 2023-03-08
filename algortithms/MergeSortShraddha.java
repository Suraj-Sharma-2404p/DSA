package algortithms;

import java.util.Arrays;

public class MergeSortShraddha {

	public static void divide(int[] arr, int start, int end) {
		if (start >= end) {
			return;
		}
		int mid = start + (end - start) / 2;
		divide(arr, start, mid);
		divide(arr, mid + 1, end);
		conquer(arr, start, mid, end);
	}

	public static void conquer(int[] arr, int start, int mid, int end) {
		int[] merged = new int[end - start + 1];
		int idx1 = start;
		int idx2 = mid + 1;
		int x = 0;

		// when both array length is equal.
		while (idx1 <= mid && idx2 <= end) {
			if (arr[idx1] < arr[idx2]) {
				merged[x++] = arr[idx1++];
			} else {
				merged[x++] = arr[idx2++];
			}
		}

		// when any one array exhaust before another.

		while (idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}
		while (idx2 <= end) {
			merged[x++] = arr[idx2++];
		}

		for (int i = 0, j = start; i < merged.length; i++, j++) {
			arr[j] = merged[i];
		}

	}

	public static void main(String[] args) {
		int[] arr = new int[] { 9, 4, 7, 6, 3, 1, 5 };
		divide(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

}
