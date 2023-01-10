package algortithms;

import java.util.ArrayList;
import java.util.List;

public class CyclicSortQuestions {

	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	public static List<Integer> findMissingNumber(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1;
			if (arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
		// for finding missing numbers
		List<Integer> ans = new ArrayList<>();
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != j + 1) {
				ans.add(j + 1);
			}
		}
		for (Integer integer : ans) {
			System.out.print(integer + "  ");
		}
		return ans;

	}

	public static int findDuplicateNumber(int[] arr) {
		int i = 0;
		int ans = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1;
			if (arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] != j + 1) {
					ans = arr[j];
				}
			}
		}
		return ans;

	}

	public static List<Integer> findAllDuplicates(int[] arr) {
		List<Integer> ans = new ArrayList<>();
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1;
			if (arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}

		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != j + 1) {
				ans.add(arr[j]);
			}

		}
		return ans;
	}

	public static int[] setMismatch(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1;
			if (arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != j + 1) {
				return new int[] { arr[j], j + 1 };
			}
		}
		return new int[] { -1, -1 };
	}

	public static int findMissingSmallestPositive(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1;
			if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != j + 1) {
				return j + 1;
			}
		}
		return arr.length + 1;

	}

	public static void main(String[] args) {
		int[] arr = { -1, 1, 3, 4 };
		/*
		 * findMissingNumber(arr); System.out.println(findDuplicateNumber(arr));
		 * List<Integer> ans = findAllDuplicates(arr); for (Integer integer : ans) {
		 * System.out.print(integer+" ,"); } int[] ans2 = setMismatch(arr); for (int i :
		 * ans2) { System.out.println(i); }
		 */

		System.out.println(findMissingSmallestPositive(arr));

	}
}
