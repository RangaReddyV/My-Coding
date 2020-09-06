package IB;

public class LongestPalindromeString {

    public static void main(String[] args) {
        LongestPalindromeString lps = new LongestPalindromeString();
        lps.longestpalindrome("abacdfgdcaba");
    }

    private void longestpalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i=0 ; i < s.length()-1 ; i++){

            for (int j = i+1; j < s.length() ; j++){
                if (s.charAt(i) == s.charAt(j)) {
                    StringBuffer sb1 = new StringBuffer();
                    int temp = i;
                    for (int k = j; k >= i; k--) {
                        if (s.charAt(k) == s.charAt(temp)){
                          //  System.out.println("i"+i+" "+s.charAt(temp));
                            sb1.append(s.charAt(k));
                            temp++;
                        }
                        else {
                            break;
                        }
                    }
                    System.out.println("sb1 "+sb1);
                    StringBuffer t = new StringBuffer(sb1);
                    String s1 = t.reverse().toString();
                    System.out.println("t reverse "+s1+" sb1 "+sb1+" "+(s1.equals(sb1.toString())));
                    if(sb.length() < sb1.length() && s1.equals(sb1.toString())) sb = sb1;
                }
            }
        }
        System.out.println("sdfdsfs"+sb);
    }
}
