package LetCo;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> subsets = new ArrayList<>();
        for (int i=0 ; i <  (1<<nums.length) ; i++){
            ArrayList<Integer> subset = new ArrayList<Integer>();
            for(int j = 0; j < nums.length; j++){
            if(((i>>j) & 1) == 1){
                    subset.add(nums[j]);
                }
            }
            subsets.add(subset);
    }

        return subsets;
}
    public static void main(String[] args) {
        Subsets st = new Subsets();
        int [] arr ={1,2,3};
        st.subsets(arr);
        System.out.println(-123%10);
        System.out.println(st.subsets(arr));

    }
}
