package IB.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {

        int startIndex = Integer.MAX_VALUE;
        int endIndex = Integer.MAX_VALUE;
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i=0; i < A.size() ; i++){
            int temp = B - A.get(i);
            System.out.println(temp+" "+A.get(i));
            if (map.containsKey(temp)){
               return new ArrayList<>(Arrays.asList(map.get(temp), i+1));
            }
            if(!map.containsKey(A.get(i)))
            map.put(A.get(i), i+1);
        }

        return new ArrayList<>();
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        System.out.println(ts.twoSum(Arrays.asList(4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8) , -3));
    }
}
