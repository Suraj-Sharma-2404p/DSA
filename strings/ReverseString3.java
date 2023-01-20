package strings;

import java.util.Stack;

public class ReverseString3 {

	public static  String reverseWords(String s) {
        Stack<Character> stack = new Stack<Character>();
        String ans = "";
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) != 	' ')
                stack.push(s.charAt(i));
            else {
                while (!stack.empty()) 
                    ans += stack.pop();
                ans += " ";
            }
        }
        while (!stack.empty())
            ans += stack.pop();
        return ans;
    }

	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}
}
