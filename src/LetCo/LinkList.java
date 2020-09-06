package LetCo;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinkList<E> {
    transient  Node<E> head;
    transient  Node<E> tail;
    transient Node<E> prev;
    public static void main(String[] args) {
        LinkList<Integer> list = new LinkList<>();
        LinkList<Integer> list2 = new LinkList<>();
        List<Integer> l = new LinkedList<>();
LinkedList<Integer> li = new LinkedList<>();
li.sort(new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
});
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list.reverseList();

      //  list.iterate();
    }

    public boolean add(E e){
        final Node<E> l = tail;
        final Node<E> newNode = new Node<>(e, l, null);
        tail = newNode;
        if(l==null){
            head = newNode;
        }
        else{
            l.next = newNode;
        }
        return true;
    }

    public void reverseList(){
         Node<E> curr = head;
        //need to save next element
         Node<E> next = null;
            while(curr != null){
            next = curr.next; // save next element
            curr.next = prev; // link next elemnt with prev element
            prev = curr;
            curr = next;
        }
        while (prev !=null){
            System.out.println(prev.element+" ");
            prev = prev.next;
        }

    }


    public void reArrangeList(){
        if (head == null || head.next == null) return;
        Node l1 = head;
        Node slow = head;
        Node fast = head;
        Node prev = null;
    }

    public void iterate(){
        while(head != null){
            System.out.println(head.element);
            head = head.next;
        }
    }
    private static class Node<E> {
        E element;
        Node next;
        Node prev;
        Node(E data , Node prev , Node next){
            this.element = data;
            this.next = next;
            this.prev = prev;
        }
    }
}