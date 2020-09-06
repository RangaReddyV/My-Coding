package LetCo.AugCha;

public class PowerOf4 {

    public boolean isPowerOfFour(int num) {
        /*java.math.BigInteger bg = new java.math.BigInteger(Integer.toString(num));
        return  num > 0 && bg.bitCount() ==1 && bg.bitLength()%2!=0;*/
        return num > 0 && (num & (num - 1)) == 0 && (num - 1) % 3 == 0;
    }
    public static void main(String[] args) {
        PowerOf4 p4 = new PowerOf4();
        System.out.println(p4.isPowerOfFour(1));
    }

}
