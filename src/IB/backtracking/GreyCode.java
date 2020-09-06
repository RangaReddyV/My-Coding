package IB.backtracking;

import java.util.ArrayList;

public class GreyCode {

    public ArrayList<Integer> grayCode(int a) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < (1 << a); i++) {
            result.add(i ^ i >> 1);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
