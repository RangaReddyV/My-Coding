package LetCo;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonacciNumber {
   static  Map<Integer , Long> fibMap = new HashMap<>();
    public static void main(String[] args) {
       Timeit.code(() ->fib(50));
        Timeit.code(() -> fibMem(50));
        //System.out.println(fib(50));
       // System.out.println(fibMem(50));
    }
// Memoised call , constant time
    private static long fibMem(int i) {
        long f =0 ;
        if (fibMap.containsKey(i)) return fibMap.get(i);
        if ( i<= 2) f=1;
        else f = fibMem(i-1) + fibMem(i-2);
        fibMap.put(i ,f );
        return f;
    }
    // normal recusive call  non -memoised
    private static long fib(int i) {

        if ( i<=2)  return 1;
        else return fib(i-1) + fib(i-2);
    }
}
