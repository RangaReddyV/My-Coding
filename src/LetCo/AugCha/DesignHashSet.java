package LetCo.AugCha;

public class DesignHashSet<K , V> {

    int size = 16;
    Node<K , V> table;

    public  DesignHashSet(){

    }

    public void add(int key) {

    }

    public void remove(int key) {

    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
    return  false;
    }

    public static class Node<K , V>{
        final int hash;
        final K key;
        V value;
        Node<K,V> next;

        Node(int hash, K key, V value, Node<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

    }

    public static void main(String[] args) {

    }
}
