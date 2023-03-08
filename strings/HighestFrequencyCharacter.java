package strings;

import java.util.HashMap;

public class HighestFrequencyCharacter {

	static void highestFrequencyCharacter(String s) {
		HashMap<Character, Integer> hmap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
//			if (hmap.containsKey(s.charAt(i))) {
//				int old = hmap.get(s.charAt(i));
//				int newfreq = old + 1;
//				hmap.put(s.charAt(i), newfreq);
//			} else {
//				hmap.put(s.charAt(i), 1);
//			}
			hmap.put(s.charAt(i),hmap.getOrDefault(s.charAt(i),0)+1);

		}
		char max = s.charAt(0);
		for (Character key : hmap.keySet()) {
			if (hmap.get(key) > hmap.get(max)) {
				max = key;
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {

		highestFrequencyCharacter("suuuuu");
	}
}
