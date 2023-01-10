package strings;

public class ReplaceCharWithOccurence {
	// method 1:
	static void replaceCharwithOccurence(String s) {
		int count = 1;
		char chartoreplace = 't';
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == chartoreplace) {
				s = s.replaceFirst(String.valueOf(chartoreplace), String.valueOf(count));
				count++;
			}
		}
		System.out.println(s);
	}

	public static void main(String[] args) {
		String input = "opentext";
//		char chartoreplace = 't';
//		// check is the character in present in stringor not.
//		if (input.indexOf(chartoreplace) == -1) {
//			System.out.println("character not available in the string");
//			System.exit(0);
//		} else {
//			int count = 1;
//			char[] arr = input.toCharArray();
//			for (int i = 0; i < arr.length; i++) {
//				if (arr[i] == chartoreplace) {
//					arr[i] = String.valueOf(count).charAt(0); // important point
//					count++;
//				}
//			}
//			System.out.println(arr);
//		}
		replaceCharwithOccurence(input);
	}
}
