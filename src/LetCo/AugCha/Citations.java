package LetCo.AugCha;

import java.util.Arrays;

public class Citations {

    public int hIndex(int[] citations) {
        if (citations.length == 0) return 0;
        Arrays.sort(citations);
        int hIndex = 0, count = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            hIndex = Math.max(hIndex, Math.min(++count, citations[i]));
        }

        return hIndex;

    }

    public static void main(String[] args) {
        Citations ct = new Citations();
        System.out.println(ct.hIndex(new int[]{1}));
    }
}
