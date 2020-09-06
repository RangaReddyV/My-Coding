package IB;

public class DivideNumber {
    public int divide(int A, int B) {
        int sign = A < 0 ^ B < 0 ? -1:1;
        long quotient = 0;
        long x = (long)A;
        x = Math.abs(x);
        B = Math.abs(B);
        while(x >= B ){
            x -=B;
            ++quotient;
        }
        return quotient > Integer.MAX_VALUE && sign ==1 ? Integer.MAX_VALUE: (int) (sign * quotient);
    }
    public static void main(String[] args) {
        DivideNumber dn = new DivideNumber();

        System.out.println(dn.divide(-2147483648, 1));
    }
}
