package IB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortByMaintaingOriginalIndex {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(34);
        list.add(12);list.add(24);
        list.add(56);
        list.add(1);
        List<ArrayList<Integer>> matrix = new ArrayList<>();

        List<Elements> list2 = new ArrayList<>();
        for (int  i =0; i < list.size(); i++){
            list2.add(new Elements(i , list.get(i)));
        }
        Collections.sort(list2);
        for (Elements e : list2){
            System.out.println(e.index+" "+e.value);
        }

    }

    private  static class Elements implements  Comparable<Elements>{
        int index;
        int value;

        public Elements(int index , int value){
            this.index = index;
            this.value = value;
        }
        @Override
        public int compareTo(Elements e) {
            return this.value - e.value;
        }
    }
}
