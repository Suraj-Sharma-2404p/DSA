package strings;

import java.util.HashMap;

public class GetCommonElements2 {

	static void getCommonElements2(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			if(hmap.containsKey(arr1[i])) {
				int oldfreq = hmap.get(arr1[i]);
				int newFreq = oldfreq+1;
				hmap.put(arr1[i], newFreq);
			}else {
				hmap.put(arr1[i], 1);
			}
		}
		System.out.println(hmap);
	}

	public static void main(String[] args) {
		int[] arr1 = new int[] {1,2,3,4,5,6,7};
		int[] arr2 = new int[] {1,2,3,4,5,6,7};
		getCommonElements2(arr1, arr2);
	}
}
