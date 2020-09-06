package LetCo.SepChalenge;

import java.util.Arrays;

public class ContainsDuplicate3 {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

      //  Arrays.sort(nums);

        for (int i=0; i < nums.length ; i++){
           // for (int j=0; j < nums.length; j++){
               // System.out.println(" "+Math.abs(nums[i]-nums[j])+Math.abs(i - j)+" "+" t "+t +" "+k+" "+" "+(Math.abs(nums[i]-nums[j]) == t && Math.abs(i - j) == k));
                if (Math.abs((long)nums[i]-(long)nums[i+k]) <= t)
                    return  true;
            //}
        }
        return  false;
    }

    public static void main(String[] args) {

        ContainsDuplicate3 containsDuplicate3 = new ContainsDuplicate3();
       // System.out.println(containsDuplicate3.containsNearbyAlmostDuplicate(new int[]{1,2,3,1} , 3,0));
        System.out.println(containsDuplicate3.containsNearbyAlmostDuplicate(new int[]{1,0,1,1} , 1,2));
        //System.out.println(containsDuplicate3.containsNearbyAlmostDuplicate(new int[]{1,5,9,1,5,9} , 2,3));
    }
}
