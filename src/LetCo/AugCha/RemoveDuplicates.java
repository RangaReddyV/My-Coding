package LetCo.AugCha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public List<Integer> findDuplicates(int[] nums) {
       // Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int i=0; i < nums.length-1 ; i++){
            int index = Math.abs(nums[i]) -1;
            System.out.println(index+" dfd"+nums[index]);
            if (nums[index] < 0){
                list.add(nums[index+1]);
            }
            else {
                nums[index] = nums[index]*-1;
            }
        }
        return list;
    }

    public List<int[]> findDuplicatesJava8(int[] nums){
        List<int[]> list = Arrays.asList(nums);
        return list.stream().filter(i -> Collections.frequency(list , i) >1).collect(Collectors.toList());
     //  Arrays.stream(nums).filter(i -> Collections.frequency(Collections.singleton(nums), i) >1).collect(Collectors.toSet())
    }

    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        int num[] = {4,3,2,7,8,2,3,1};
        System.out.println(rd.findDuplicatesJava8(num));

    }

}
