package LetCo;

import java.util.Arrays;
import java.util.Collections;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        Integer [] arr =  {100 ,200,700, 400, 800};
        Arrays.sort(arr , Collections.reverseOrder());

        System.out.println(arr[0] + arr[1]);
    }
}
