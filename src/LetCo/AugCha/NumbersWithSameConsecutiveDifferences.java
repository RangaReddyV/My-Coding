package LetCo.AugCha;

import java.util.ArrayList;
import java.util.List;

public class NumbersWithSameConsecutiveDifferences {

    public int[] numsSameConsecDiff(int N, int K) {
        List<Integer> res = new ArrayList<>();
        calculate(K,N,0 , res);

        int[] ans = new int[res.size()];
        for(int i = 0; i < ans.length; i++) ans[i] = res.get(i);
        return ans;
    }

    public void calculate(int k,int N, int cur , List<Integer> res){
        if(N == 0){
            res.add(cur);
            return;
        }

        for(int i = 0; i < 10; i++){
            if(cur == 0&& i == 0 && N != 1) continue;
            int pre = cur % 10;

            if(cur == 0)
                calculate(k, N-1, i , res);
            else if(Math.abs(pre - i) == k)
                calculate(k, N-1, 10 * cur + i , res) ;
        }
    }

    public static void main(String[] args) {

    }
}
