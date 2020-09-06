package IB;

import java.util.ArrayList;

public class primeNumbers {
    public ArrayList<Integer> sieve(int A) {
        ArrayList<Integer> list = new ArrayList<>();
        String s ;
        StringBuffer sb = new StringBuffer();
        String.valueOf(sb.reverse());
        if (A==2 || A>1){
            list.add(2);
        }
        for (int i=3; i <=A ; i=i+2){

            if(isPrime(i)){
                list.add(i);
            }
        }

        return list;
    }

    boolean  isPrime(int n){

        for (int i=2; i<(int)Math.sqrt(n)+1; i++){

            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

