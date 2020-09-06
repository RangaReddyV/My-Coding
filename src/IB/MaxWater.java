package IB;

import java.util.ArrayList;
import java.util.Collections;

public class MaxWater {
    public int maxArea(ArrayList<Integer> A) {

        int min =  Integer.MAX_VALUE;
        int maxWater = 0;
        int left = 0;
        int right = A.size()-1;

        while(left < right){
            maxWater = Math.max(maxWater , Math.min(A.get(left), A.get(right)*A.get(right -left)));
            if(A.get(left) < A.get(right)){
                left++;
            }
            else {
                right--;
            }
        }

        for (int i=0 ; i<A.size(); i++){
            int j = A.size()-1;
            while(j > i){
                 min = Math.min(A.get(i), A.get(j));
                int temp = min*A.get(i);
                maxWater = Math.max(temp , maxWater);
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {

    }
}
