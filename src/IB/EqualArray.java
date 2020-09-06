package IB;

import java.util.*;

public class EqualArray {
    public ArrayList<Integer> equal(ArrayList<Integer> A) {
        Map<Integer ,   ArrayList<Integer>> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i=0; i< A.size(); i++){
            for (int j=i+1; j <A.size(); j++){
                int sum = A.get(i) + A.get(j);
                if(map.containsKey(sum) && map.get(sum).size()==2){
                    int a = map.get(sum).get(0);
                    int b = map.get(sum).get(1);
                    int c = i;
                    int d = j;
                    if (a < b && a < c && c < d && b!=c && b!=d){
                        ArrayList<Integer> arrayList = new ArrayList<>();
                        arrayList.add(a);
                        arrayList.add(b);
                        arrayList.add(c);
                        arrayList.add(d);
                        list.add(arrayList);
                        ArrayList<Integer> t = new ArrayList<>();
                        map.put(sum, t);
                    }
                }
                else {
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    arrayList.add(i);
                    arrayList.add(j);
                    map.put(sum , arrayList);
                }
            }
        }
        Collections.sort(list, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) {
                int value = list1.get(0).compareTo(list2.get(0));
                if(value ==0 )
                    value = list1.get(1).compareTo(list2.get(1));

                if(value == 0)
                    value = list1.get(2).compareTo(list2.get(2));
                if(value == 0)
                    value = list1.get(3).compareTo(list2.get(3));
                return value;
            }
        });
        return  list.size() > 0 ? list.get(0):new ArrayList<>();
    }
    public static void main(String[] args) {
        EqualArray eq = new EqualArray();
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(1);
        temp.add(1);
        temp.add(1);
        temp.add(1);
        temp.add(1);
        //temp.add(1);
        //temp.add(8);

        System.out.println(eq.equal(temp));
    }
}
