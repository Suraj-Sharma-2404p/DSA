package strings;

public class Reverse {
	
	// method 1 : using charArray
	
	static void reverse(String s) {
		char[] ch = s.toCharArray();
		for (int i = ch.length-1;i>= 0; i--) {
			System.out.print(ch[i]);
		}
	}
	
	static void reverse2(String s) {
		for(int i = s.length()-1; i>= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}
	
	static void reverse3(String s) {
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		
	}
	
	static void reverse4(String s) {
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
	}
	
	public static void main(String[] args) {
		reverse4("HELLO");
	}

}
