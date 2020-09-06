package IB.Hashing;

import java.util.HashMap;
import java.util.Map;

public class LonegstSubStringWithoutrepeatingcharactera {

    public int lengthOfLongestSubstring(String A) {
        int startIndex = 0;
        int length = 0;
        Map<Character , Integer> map1 = new HashMap<>();
        for (int i=0; i < A.length(); i++){
            char ch = A.charAt(i);
                while (map1.containsKey(ch)){
                    map1.remove(ch);
                    startIndex++;
                }
            map1.put(ch, i);
                length = Math.max(length , map1.size());
        }
        System.out.println("rasd"+length);
        Map<Character, Integer> map = new HashMap<>();
        String output = "";
        int start =0;
        int end =0;
        for (end = 0; end < A.length(); end++) {
            char currChar = A.charAt(end);
            if (map.containsKey(currChar)) {
                start = Math.max(map.get(currChar)+1, start);
            }
            if (output.length() < end - start + 1) {
                output = A.substring(start, end + 1);
            }
            map.put(currChar, end);
        }
        return output.length();
    }

    public static void main(String[] args) {
        LonegstSubStringWithoutrepeatingcharactera ls = new LonegstSubStringWithoutrepeatingcharactera();
        System.out.println("ABC".hashCode()+" "+"CBA".hashCode()+" "+"CAB".hashCode());
        System.out.println(ls.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(ls.lengthOfLongestSubstring("bbbbbb"));
        System.out.println(ls.lengthOfLongestSubstring("abcadefgh"));
    }
}
