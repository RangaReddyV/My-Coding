package item18;

import java.util.*;

class FowardSet implements  Set{

    private final Set s ;
    public  FowardSet(Set s){
        this.s =s;
    }
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    public void tet(){

    }
    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
public class InstrumntedHashSet extends  FowardSet  {

    private int addCount = 0;
    //private Set set;
    public InstrumntedHashSet(Set s){
       super(s);
    }
    @Override
    public void tet(){

    }
    @Override
    public boolean add(Object o) {
        addCount++;
        return super.add(o);
    }

    public boolean addAll(Collection c) {
        addCount= c.size();
        return super.addAll(c);
    }

    public int getCount(){
        return  addCount;
    }

    public static void main(String[] args) {
        InstrumntedHashSet set = new InstrumntedHashSet(new HashSet());
        //set.add(1);
        //set.add(2);
        //set.add(3);
        int ar [] = {1,2,3};
        System.out.println(set.getCount());
        set.addAll(Arrays.asList(1,34,54));
        System.out.println(set.getCount());
    }
}

