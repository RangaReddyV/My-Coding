package LetCo.SepChalenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PartitionLabels {

    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<>();
        /*int[] freq = new int[26];
        for (int i = 0; i < S.length(); i++)
            freq[S.charAt(i) - 'a'] = i;*/
        int start = 0, end = 0;
        for (int i = 0; i < S.length(); i++) {
            end = Math.max(end, S.lastIndexOf(S.charAt(i)));
            if (end == i) {
                result.add(end - start + 1);
                start = end + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
