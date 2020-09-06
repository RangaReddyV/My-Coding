package Cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    private int capacity;
    private Map<Integer, Node> lruMap;
    Node head, tail;

    public LRUCache(int capacity) {
        this.lruMap = new HashMap<>(capacity);
        this.capacity = capacity;
    }

    public int get(int key) {

        if (!lruMap.containsKey(key))
            return -1;
        Node temp = lruMap.get(key);
        removeAtFirst(temp);
        addAtLast(temp);
        return temp.value;
    }

    public void put(int key, int value) {
        if (lruMap.containsKey(key)) {
            Node node = lruMap.get(key);
            node.value = value;
            removeAtFirst(node);
            addAtLast(node);
        } else {
            Node current = new Node(key, value);
            lruMap.put(key, current);
         //   System.out.println("sdfsfdasdafd"+lruMap.get(key).value);
            addAtLast(current);
            if (capacity < lruMap.size()) {
                lruMap.remove(head.key);
                removeAtFirst(head);
            }

        }
    }

    private void addAtLast(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    private void removeAtFirst(Node node) {
        if (node == head)
            head = head.next;
        else if (node == tail)
            tail = tail.prev;
        else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1,1);
        cache.put(2,2);
        System.out.println(cache.get(1));
        cache.put(3,3);
        System.out.println(cache.get(2));

    }
}
