package LetCo.AugCha;

public class LongestPalindromeString {

    public int longestPalindrome(String s) {

        long count =0;
        for (int start =0; start < s.length(); start++){
           long mask;
           char ch = s.charAt(start);
           System.out.println(ch);
            if(ch <= ch -'a')
                mask = 1L << (ch -'a');
            else
                mask = 1L << (26 + ch -'A');
            count = count^mask;
        }
        System.out.println(count);
        if (count == 0)
            return s.length();
        else
            return s.length() - Long.bitCount(count) + 1;
    }

    public static void main(String[] args) {
        LongestPalindromeString lps = new LongestPalindromeString();
        System.out.println(lps.longestPalindrome("aaaAaaaa"));
    }
}
