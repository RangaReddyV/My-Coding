package IB;

import sun.misc.GC;

public class GCD {
    public int gcd(int A, int B) {

        int gcd = 0;
        while(B%A!=0){
            System.out.println(B%A);
            gcd = B%A;
            B = A;
            A = gcd;
            System.out.println(gcd);
        }
        return gcd;
    }

    public static void main(String[] args) {
        GCD gc = new GCD();
        System.out.println(gc.gcd(4,6));

    }

}
