package strings;

import java.util.HashMap;

public class FirstNonRepeatedCharacterInString {

	// without using hashmap
	static void firstNonRepeatedCharacter(String s) {
		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			boolean unique = true;
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.print(s.charAt(i));

			}
		}

	}

	// using hashmap
	
	static void firstNonRepeatedCharacter2(String s) {
		HashMap<Character, Integer> hmap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch) + 1);
			} else {
				hmap.put(ch, 1);
			}
		}
		System.out.println(hmap);
		
	}

	public static void main(String[] args) {
		String s = "AABCDBE";
		firstNonRepeatedCharacter2(s);
	}
}
