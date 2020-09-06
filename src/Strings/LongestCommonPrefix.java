package Strings;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] A) {
        if (A.length <2) return A[0];
        String s1 = A[0];
        String s2 = A[1];
        StringBuilder sb = new StringBuilder();
        for (int i =0, j=0 ; i < s1.length() && j < s2.length(); i++){
            if (s1.charAt(i) != s2.charAt(j))
                break;
            j++;
            sb.append(s1.charAt(i));
        }
        String commonPrefix = sb.toString();
        System.out.println(commonPrefix);
        if(A.length >2) {
            for (int i = 2; i < A.length; i++) {
                String temp = A[i].substring(0, commonPrefix.length());
                System.out.println(temp +" ");
                if (!temp.equals(commonPrefix)) {
                    commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
                    i--;
                }
            }
        }
        return  commonPrefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix prefix = new LongestCommonPrefix();
        System.out.println("hgwfwf"+prefix.longestCommonPrefix(new String[]{"abcd", "abcd", "efgh"}));
    }
}
