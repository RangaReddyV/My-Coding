package Gener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Item28EJ {
    public static void main(String[] args) {
        Object objArr[] = new Long[1];
       // objArr[0] =" Hi Hello";
        List<Long> list = new ArrayList<Long>();
        //list.add("hello");
        List<String>[] strList = new List[10];
        List<Integer> intList = Arrays.asList(42);
        Object obj[] = strList;
        obj[0] = intList;
        String s = strList[0].get(0);
       // Stack<E> stac  = new Stack<E>();

    }
}
