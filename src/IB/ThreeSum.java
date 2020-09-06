package IB;

import java.util.ArrayList;
import java.util.Collections;

public class ThreeSum {

    public int closestSum(ArrayList<Integer> A, int B){
        int target=0;
        int size = A.size();
        Collections.sort(A);
        int min = Integer.MAX_VALUE;
        for (int i=0; i< A.size(); i++){
            int left = i+1;
            int right = size-1;
            while(left < right){
                int sum = A.get(i) + A.get(left) + A.get(right);
                if(sum ==B){
                    target = sum;
                    return  target;
                }
                else  {
                    int change = Math.abs(B - sum);
                    if (change < min){
                        target = sum;
                        min = change;
                    }
                    if (sum > B){
                        right --;
                    }
                    else {
                        left ++;
                    }

                }
            }

        }
        System.out.println(target);
        return target;
    }
    public static void main(String[] args) {
        ThreeSum ts = new ThreeSum();
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(-1);
        ar.add(2);
        ar.add(1);
        ar.add(-4);
        System.out.println(ts.closestSum(ar, 1));

    }
}
