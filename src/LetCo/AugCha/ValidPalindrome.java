package LetCo.AugCha;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int len = s.length();
        for (int i = 0; i < len/2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome("A man,  plan, a canal: Panama"));
    }
}
