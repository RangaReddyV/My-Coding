package IB.Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class PointsOnStraightLine {

    class Point{
        private int x;
        private int y;
        public Point(int x , int y){
            this.x = x;
            this.y = y;
        }
    }
    public int maxPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
        int maxPointsResult = 0;
        int size = a.size();
        HashMap<Double, Integer> slopeMap = new HashMap<>();
        for (int i=0; i < size; i++){
            int duplicate = 1;
            int vertical = 0;
            int x1 = a.get(i);
            int y1 = b.get(i);
            for (int j = i+1 ; j < size ; j++) {
                int x2 = a.get(j);
                int y2 = a.get(j);
                if (x1 == x2) {
                    if (y1 == y2) {
                        duplicate++;
                    } else {
                        vertical++;
                    }
                } else {
                    double slope = findSlope(x1, x2, y1, y2);
                    if (slopeMap.containsKey(slope)) {
                        slopeMap.put(slope, slopeMap.get(slope) + 1);
                    } else
                        slopeMap.put(slope, 1);
                }
            }
                for (int sl : slopeMap.values()) {
                    if (maxPointsResult < sl + duplicate)
                        maxPointsResult = sl + duplicate;
                }

                maxPointsResult = Math.max(vertical + duplicate, maxPointsResult);
                slopeMap.clear();

        }
        return  maxPointsResult;
    }

    private double findSlope(int x1 , int x2, int y1, int y2){
        if(y2 - y1 == 0)
            return  0.0;
        else if(x2 - x1 == 0)
            return Double.MAX_VALUE;
        else
            return (y2-y1)/(x2-x1);
    }

    public static void main(String[] args) {

    }
}
