package Sorting;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    class ListNode {
     public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }
    public ListNode mergeKLists(ArrayList<ListNode> a) {
        PriorityQueue<ListNode>  queue = new PriorityQueue<>();
        for(ListNode node:a)
            while (node != null) {
                queue.add(node);
                node = node.next;
            }

        ListNode head = new ListNode(Integer.MIN_VALUE);
        ListNode temp = head;
        for(int i=0; i <queue.size();i++){
            temp.next = queue.poll();
        }
        return head.next;
    }

    public static void main(String[] args) {

    }
}
