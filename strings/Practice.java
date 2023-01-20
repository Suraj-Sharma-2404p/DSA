package strings;

public class Practice {
	
	static void reverseString(String s) {
		
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}
	public static void main(String[] args) {
	reverseString("ROCK");	
	}

}
