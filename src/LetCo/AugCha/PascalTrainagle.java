package LetCo.AugCha;

import java.util.ArrayList;
import java.util.List;

public class PascalTrainagle {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for (int i=0; i <=rowIndex ; i++){
            int j =0;
            while (result.size()-1 > j){
                result.add(result.get(0) + result.get(1));
                result.remove(0);
                j++;
            }
            result.add(1);
        }
        return  result;
    }

    public static void main(String[] args) {
        PascalTrainagle pst = new PascalTrainagle();
        System.out.println(pst.getRow(1));
        System.out.println(pst.getRow(2));
        System.out.println(pst.getRow(3));
        System.out.println(pst.getRow(4));
        System.out.println(pst.getRow(33));

    }
}
