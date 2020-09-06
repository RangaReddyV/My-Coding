package LetCo;

import java.util.*;

public class twoSUm {
    public static void main(String[] args) {
        int [] arr = {4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8};
        int a [] =sum(arr , -3);
        System.out.println( a[0]+" "+a[1]);
    }

    private static int[] sum(int[] arr, int target) {
      int index = 0;
      Map<Integer , Integer> map = new HashMap<>();
        for(int i : arr){
            int te = target - i;
            if(map.containsKey(te)){
                return new int[]{map.get(te), index};
            }
            else{
                map.put(i, index++);
            }
        }
        return new int[]{0,0};
    }

}
