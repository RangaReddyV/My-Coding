package IB;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindowMax {

    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        for (int i=0 ; i < B; i++){
            while (!deque.isEmpty() && A.get(deque.peekLast()) <= A.get(i)){
                deque.removeLast();
            }
            deque.addLast(i);
        }

        for (int i=0 ; i< A.size(); i++){
            list.add(A.get(deque.peekFirst()));
            //remove from last
            while (!deque.isEmpty() && deque.peek() <= i-B){
                deque.removeFirst();
            }
            //remove fro first
            while (!deque.isEmpty() && A.get(deque.peekLast()) <= A.get(i)){
                deque.removeLast();
            }
            deque.addLast(i);
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        SlidingWindowMax sd = new SlidingWindowMax();
        list.add(1);
        System.out.println(sd.slidingMaximum(list, 1));
    }
}
