package IB;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(s);
        StringBuffer sb = new StringBuffer(s);
        String s1 = sb.reverse().toString();
        System.out.println(sb);
        System.out.println(s.equals(s1));
    }

}
