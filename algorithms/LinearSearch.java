package algortithms;

public class LinearSearch {
	
	public static boolean isPresentinString(String str , char target) {
		if(str.length() == 0) {
			return false;
		}
		for(int i =0 ; i<str.length() ; i++) {
			if(target == str.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	
	static boolean searchInString(String str , char target) {
		if(str.length() == 0) {
			return false;
		}
		boolean ans = false;
		for (char ch : str.toCharArray()) {
			 ans =  target == ch ? true: false;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		String str = "suraj";
		char target = 'j';
		System.out.println(isPresentinString(str, target));
		System.out.println(searchInString(str, target));
		
	}
	
}
