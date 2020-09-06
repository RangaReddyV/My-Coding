package IB;

import java.util.ArrayList;

public class RemoveDuplicates {
    public int removeDuplicates(ArrayList<Integer> a) {
        int newLength = 0;
        if(a.size() == 0 ){
            return 0;
        }
        for (int i=0; i<a.size()-1;i++){
                System.out.println(a.get(i)+" "+a.get(i+1));
                if(a.get(i).equals(a.get(i+1))){
                    a.remove(i);
                    i--;
                }

        }
        System.out.println(a);
        return a.size();
    }

    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(5000);
        ar.add(5000);
        ar.add(5000);
        System.out.println(rd.removeDuplicates(ar));
    }
}
