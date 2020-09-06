package IB;

import java.util.ArrayList;

public class MergeTwoLists {

    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {

        int j=a.size()-1;
        int k=b.size()-1;
        int length = a.size()+ b.size();
        System.out.println(length);
        ArrayList<Integer> a1 = new ArrayList<>(length);
        for (int i=length-1; i >=0 ; i-- ){
            if (a.get(j) > b.get(k)){
                System.out.println("sdgfd"+i+" "+j);
                a1.add(i, a.get(j));
                j--;
            }
            else{
                System.out.println(b.get(k));
                System.out.println("rrrrr"+i+" "+k);
                a1.add(i, b.get(k));
                k--;
            }
        }
        a =a1 ;
        a1 =null;
        System.out.println(a);
    }
    public static void main(String[] args) {

        MergeTwoLists mr = new MergeTwoLists();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-4);
        arr.add(-3);
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(-2);
        arr1.add(-2);
        mr.merge(arr , arr1);

    }
}
