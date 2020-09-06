import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Test1 {

    public static void main(String[] args) {

                int x = 1012;
                String number = String.valueOf(x);
                IntStream sq = number.chars().map(Character::getNumericValue);
            //    sq.forEach(System.out::println);
                int stream = (int) number.chars()
                                         .map(Character::getNumericValue)
                                         .filter(e -> e >0)
                                         .filter(e -> x%e ==0)
                                        .count();
          //      System.out.println(stream);
                System.out.println(compute(25));

    }

    private static BigInteger compute(int x) {


        if (x == 0){
           // in =BigInteger.valueOf(x).multiply(BigInteger.valueOf(x-1));
          return BigInteger.valueOf(1);
        }
        return BigInteger.valueOf(x).multiply(compute(x-1));
    }


}
