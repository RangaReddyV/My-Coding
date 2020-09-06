package IB.backtracking;

import java.util.StringTokenizer;

public class LengthLastword {
    public  int lastWord(String A){
        StringTokenizer st = new StringTokenizer(A);
        String s = A.replaceAll("\\s+"," ");
        String arr[] = s.split(" ");
        return arr.length > 0 ? arr[arr.length-1].length():0;
    }
    public static void main(String[] args) {
        LengthLastword ls = new LengthLastword();
        System.out.println(ls.lastWord("  "));
    }
}
