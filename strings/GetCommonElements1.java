package strings;

import java.util.HashMap;

public class GetCommonElements1 {
	static void getCommonElements1(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			if (hmap.containsKey(arr1[i])) {
				int old = hmap.get(arr1[i]);
				int newfreq = old + 1;
				hmap.put(arr1[i], newfreq);
			} else {
				hmap.put(arr1[i], 1);
			}
		}
//		for (int i = 0; i < arr2.length; i++) {
//			if (hmap.containsKey(arr2[i])) {
//				int old = hmap.get(arr2[i]);
//				int newfreq = old + 1;
//				hmap.put(arr2[i], newfreq);
//			} else {
//				hmap.put(arr2[i], 1);
//			}
//		}
		// System.out.println(hmap);
		for (int val : arr2) {
			if (hmap.containsKey(val)) {
				System.out.print(val + " ");
				hmap.remove(val);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = new int[] { 1, 2, 3, 8, 4 };
		getCommonElements1(arr1, arr2);
	}
}
