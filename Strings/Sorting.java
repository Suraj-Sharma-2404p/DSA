package strings;

public class Sorting {
	// without using sort method
	static void sorting(String s) {
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		System.out.println(arr);
	}

	static void swap(char[] arr, int first, int last) {
		char temp = arr[first];
		arr[first] = arr[last];
		arr[last] = temp;
	}

	public static void main(String[] args) {
		sorting("ROCK");

	}

}
