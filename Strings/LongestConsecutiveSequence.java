package strings;

import java.util.HashMap;

public class LongestConsecutiveSequence {
	static void longestConsecutiveSequence(int[] arr) {
		HashMap<Integer, Boolean> hmap = new HashMap<>();
		for (int val : arr) {
			hmap.put(val, true);
		}
		for (int val : arr) {
			if (hmap.containsKey(val - 1)) {
				hmap.put(val, false);
			}
		}
		int ml = 0;
		int msp = 0;
		for (int val : arr) {
			if (hmap.get(val) == true) {
				int tl = 1;
				int tsp = val;
				while (hmap.containsKey(val + tl)) {
					tl++;
				}
				if(tl > ml) {
					msp = tsp;
					ml = tl;
				}
			}
		}
		for(int i = 0 ; i<ml;i++) {
			System.out.print((msp +i)+" ");
		}
		
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 5, 9, 1, 11, 8, 6, 3, 12, 2 };
		longestConsecutiveSequence(arr);
	}
}
