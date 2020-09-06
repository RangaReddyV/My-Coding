package LetCo.AugCha;

import java.util.ArrayList;
import java.util.List;

public class PancakeSorting {

    public List<Integer> pancakeSort(int[] A) {
        List<Integer> result = new ArrayList<>();

        int len = A.length;
        for (int curLen = len ; curLen > 1; curLen--) {
            int maxIndex = findMaxIndex(A, curLen);

            if (curLen-1 != maxIndex) {
                flip(A, maxIndex);
                result.add(maxIndex);
                flip(A, curLen);
                result.add(curLen);

            }
        }
        return result;
    }

    private void flip(int[] a, int curLen) {
        int temp, start = 0;
        while (start < curLen) {
            temp = a[start];
            a[start] = a[curLen];
            a[curLen] = temp;
            start++;
            curLen--;
        }
    }

    private int findMaxIndex(int[] a, int curLen) {
        int maxIndex = 0;
        for (int i = 0; i < curLen; i++) {
            if (a[i] > a[maxIndex])
                maxIndex = i;
        }
        return maxIndex;
    }

    public static void main(String[] args) {

    }
}
