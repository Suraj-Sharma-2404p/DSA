package strings;

public class RemoveAllWhiteSpaces {
	
	static String whiteSpacesRemoval(String s) {
		//String newString = s.trim();
		String newString = s.replaceAll("\\s", "");
		return newString;
	}
	
	public static void main(String[] args) {
		System.out.println(whiteSpacesRemoval("    R RA  RARRA   "));
	}
}
