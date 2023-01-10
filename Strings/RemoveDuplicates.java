package strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	// using java 8
	static void removeDuplicates(String s) {
		StringBuilder sb = new StringBuilder();
		s.chars().distinct().forEach(c -> sb.append((char)c));
		System.out.println(sb);
	}
	
	// using string class
	static void removeDuplicates2(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int idx = s.indexOf(ch, i+1);
			if(idx == -1) {
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}

	// using characterarray
	static void removeDuplicates3(String s) {
		char[] ch = s.toCharArray();
		StringBuilder sb3 = new StringBuilder();
		for (int i = 0; i < ch.length; i++) {
			boolean repeated = false;
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i] == ch[j]) {
					repeated = true;
					break;
				}
			}
			if (!repeated) {
				sb3.append(ch[i]);
			}
		}
		System.out.println(sb3);
	}
	
	//using set interface
	static void removeDuplicates4(String s) {
		StringBuilder sb4 = new StringBuilder();
		Set<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character character : set) {
			sb4.append(character);
		}
		System.out.println(sb4);
	}
	public static void main(String[] args) {
		removeDuplicates("programming");
		removeDuplicates2("programming");
		removeDuplicates4("programming");
		removeDuplicates3("programming");
	}
}
