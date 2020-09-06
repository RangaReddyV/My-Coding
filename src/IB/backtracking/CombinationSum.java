package IB.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class CombinationSum {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
        HashSet<HashSet<Integer>> result = new HashSet<>();
        a.sort(null);
        Collections.sort(a);
        for (int i=0; i < a.size(); i++) {
            getListOfCombinations(a, b, result, 0, i, new ArrayList<Integer>());
        }
        return  new ArrayList<ArrayList<Integer>>();
    }

    private void getListOfCombinations(ArrayList<Integer> a, int sum, HashSet<HashSet<Integer>> result, int tempSum, int pos , ArrayList<Integer> list) {
        tempSum = tempSum + a.get(pos);
        list.add(a.get(pos));
        if (tempSum == sum){
            result.add(new HashSet<Integer>(list));
            return;
        }
        for (int j=pos+1; j < a.size(); j++){
            System.out.println(tempSum);
            getListOfCombinations(a, sum , result , tempSum,j , new ArrayList<Integer>(list));
        }
    }

    public static void main(String[] args) {
        CombinationSum csm = new CombinationSum();
        System.out.println(csm.combinationSum(new ArrayList<Integer>(Arrays.asList(10,1,2,7,6,1,5)), 8));
    }
}
