package LetCo;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int [] arr = {2147483647, -2147483648, -2147483648, 0, 1};
        ArrayList<ArrayList<Integer>> list = threeSum(Arrays.asList(2147483647, -2147483648, -2147483648, 0, 1));
        System.out.println(list);
    }

    private static ArrayList<ArrayList<Integer>> threeSum(List<Integer> num) {
       Collections.sort(num);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < num.size()-2; i++) {
            if (i == 0 || (i > 0 && num.get(i) != num.get(i-1))) {
                int lo = i+1, hi = num.size()-1 ;
                        long sum = 0 - num.get(i);
                while (lo < hi) {
                    System.out.println(num.get(lo)+num.get(hi)+num.get(i));
                    if (num.get(lo).longValue() + num.get(hi).longValue() == sum) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(num.get(i));
                        temp.add(num.get(lo));
                        temp.add(num.get(hi));
                        res.add(temp);
                        while (lo < hi && num.get(lo) == num.get(lo+1)) lo++;
                        while (lo < hi && num.get(hi) == num.get(hi-1)) hi--;
                        lo++; hi--;
                    } else if (num.get(lo) + num.get(hi) < sum) lo++;
                    else hi--;
                }
            }
        }

        return res;
    }
}
