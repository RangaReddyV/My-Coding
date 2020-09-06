package LetCo.AugCha;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverLappingIntervals {

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length <=1) return 0;
        Arrays.sort(intervals , Comparator.comparingInt((int [] it) -> it[0]));
        System.out.println(intervals);
        int overlapIntervals = 0;
        int end = intervals[0][1];
        for (int interval =1; interval < intervals.length; interval++){
            System.out.println(end+" "+intervals[interval][1]);
            if (end > intervals[interval][0]) {
                end = Math.min(end, intervals[interval][1]);
                overlapIntervals++;
            }
            else end = intervals[interval][1];
        }
        return  overlapIntervals;
    }

    public static void main(String[] args) {
        NonOverLappingIntervals nonOverLappingIntervals = new NonOverLappingIntervals();
        int arr[][] = {{1,100},{11,12},{1,11},{2,12}};
        System.out.println(nonOverLappingIntervals.eraseOverlapIntervals(arr));
    }
}
