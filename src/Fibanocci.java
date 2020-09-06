import java.math.BigInteger;

public class Fibanocci {
    long gcd = 0l;
    long gcd(long a , long b){
       if (a % b == 0)
           return b;
       else {
           return  gcd(b, a % b);
       }
    }

    public static void main(String[] args) {
        Fibanocci fib = new Fibanocci();
        System.out.println(fib.gcd(24,96));
    }
}
