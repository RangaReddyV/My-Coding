package IB;

import javax.swing.text.Position;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinStepsInInfinite {
    Integer[] a = { 1, 2, 3, 4, 5, 6};


    public int maxSum(final List<Integer> list){
        int max = list.get(0);
        int max1 = list.get(0);
         final List<Integer> A = Arrays.asList(a);
        Collections.sort(A);
        boolean isFirst = false;
        boolean isLast = true;
        int size = A.size();
        for (int  i=0 ; i < A.size()-1; i++){
            if (!isFirst && A.get(i)>0 && A.get(i)==1){
                isFirst = true;
            }
            else if (!isFirst){
                System.out.println(1);
            }
            if (A.get(i) > 0 && (A.get(i+1) - A.get(i))!=1){
                isLast = false;
                System.out.println(A.get(i)+1);
            }
        }

        if (isLast && A.get(size-1) > 0) {
            System.out.println(A.get(size-1) + 1);
        }

      /*  ArrayList<ArrayList<Integer>> las = new ArrayList<>();
        las.set(1, new ArrayList<>().set(j,0););
       //List<Integer> l = A.stream().filter(e->Collections.frequency(A,e)>1).distinct().collect(Collectors.toList());
        Collections.sort(A);
        Deque<Position> q = new LinkedList();
        q.peekLast().*/
        for (int i=0; i < A.size()-1 ; i++){
            System.out.println(A.get(i));
            if (A.get(i).equals(A.get(i+1))){
                System.out.println(A.get(i));
                break;
            }
        }
        //return -1 ;
       //l.forEach(System.out::println);
        for (int i=1 ; i< list.size(); i++){
            max1 = Math.max(max1+list.get(i) , list.get(i));
            max = Math.max(max1 , max);
        }
        //System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        int [] arr1 = {4,1,4,10};
        int [] arr2 = {6,2,5,12};
        int minCount = 0;
        ArrayList arr = new ArrayList();
        MinStepsInInfinite a = new MinStepsInInfinite();
        a.maxSum(Arrays.asList(1,2,3,4,-10));
        for (int i=0 ; i < arr1.length-1 ;i++){
           // System.out.println(minCount);

            minCount += finMinCount(arr1[i] , arr1[i+1], arr2[i], arr2[i+1]);
        }
       // System.out.println(minCount);
    }

    private static int finMinCount(int x1, int x2, int y1, int y2) {

        int dx= Math.abs(x2-x1);
        int dy = Math.abs((y2-y1));
        return  Math.max(dx,dy);
    }


}
