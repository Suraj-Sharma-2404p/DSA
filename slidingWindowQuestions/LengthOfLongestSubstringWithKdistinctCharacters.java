package slidingWindowQuestions;

import java.util.HashMap;

//Given a string, find the length of the longest possible substring in it that has exactly K distinct characters. If there is no possible substring then print -1.
public class LengthOfLongestSubstringWithKdistinctCharacters {
	static int solution(String str ,int k) {
		int windowstart = 0;
		int max =0;
		HashMap<Character,Integer> hasmap = new HashMap<>();
		for (int windowend = 0 ; windowend < str.length() ; windowend++){
			char c = str.charAt(windowend);
			hasmap.put(c,hasmap.getOrDefault(c,0)+1);

			while(hasmap.size()>k){
				char leftChar = str.charAt(windowstart);
				hasmap.put(leftChar,hasmap.get(leftChar)-1);
				if(hasmap.get(leftChar) == 0){
					hasmap.remove(leftChar);
				}
				windowstart++;
			}
			if (hasmap.size() == k){
				max = Math.max(max,windowend-windowstart+1);
			}

			}
		return max;
		
	}
	public static void main(String[] args) {
		String S = "aabacbebebe";
		System.out.println(solution(S,3));
	}
}
