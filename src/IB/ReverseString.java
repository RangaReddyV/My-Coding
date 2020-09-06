package IB;

import java.util.StringTokenizer;

public class ReverseString {
    public String revstring(String A){
        A = A.replaceAll("\\s+"," ");
        StringTokenizer st = new StringTokenizer(A);
        System.out.println(A);
        String arr[] = A.split(" ");
        String rev ="";
        for (int i=arr.length-1; i >=0 ; i--){
            System.out.println(arr[i]);
            //arr[i] = arr[i].replaceAll("\\s","");
            System.out.println(arr[i]);
            if (arr[i] !=" ") {
                rev += arr[i] + " ";
            }
        }
        return  rev.trim();
    }
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.revstring("qxkpvo  f   w vdg t wqxy ln mbqmtwwbaegx   mskgtlenfnipsl bddjk znhksoewu zwh bd fqecoskmo"));
    }
}
