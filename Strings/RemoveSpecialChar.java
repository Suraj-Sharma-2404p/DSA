package strings;

public class RemoveSpecialChar {
	
	static String removeSpecialChar1(String s) {
		String newString= s.replaceAll("[^a-zA-Z0-9]", "");
		return newString;
	}

	public static void main(String[] args) {
		String ans = removeSpecialChar1("!@#$#REA$%$#@D");
		System.out.println(ans);
	}
}
