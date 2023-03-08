package slidingWindowQuestions;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacter {
    static int solution(String s){
        int windowstart = 0;
        int max = 0;
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(int windowend = 0 ; windowend < s.length();windowend++){
            char c = s.charAt(windowend);
            hashmap.put(c,hashmap.getOrDefault(c,0)+1);
            while (hashmap.size() < windowend-windowstart+1){
                char leftChar = s.charAt(windowstart);
                hashmap.put(leftChar,hashmap.get(leftChar)-1);
                if (hashmap.get(leftChar) == 0){
                    hashmap.remove(leftChar);
                }
                windowstart++;
            }
            if (hashmap.size() == windowend-windowstart+1){
                max = Math.max(max, windowend-windowstart+1);
            }
        }
        return  max;
    }
    public static void main(String[] args) {
        String s = "aababcbb";
        System.out.println(solution(s));
    }
}
