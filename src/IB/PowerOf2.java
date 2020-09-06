package IB;


public class PowerOf2 {

    public int power2(String s){
        int n =0 ;
        java.math.BigInteger bg = new java.math.BigInteger(s);
        ;
        System.out.println(bg.bitCount());
        System.out.println(bg.bitLength());
        if (bg.compareTo(java.math.BigInteger.ZERO) ==0 || bg.compareTo(java.math.BigInteger.ONE) ==0) return 0;
        for (int i=0; i < bg.bitLength(); i++){
            if(bg.testBit(i)) return 0;
        }
        int x=0, y=0;
        Math.pow(x,y);
        return bg.testBit(bg.bitLength()-1) ? 1 : 0;

    }
    public static void main(String[] args) {
            PowerOf2 pw = new PowerOf2();

        pw.power2("-64");
    }
}
