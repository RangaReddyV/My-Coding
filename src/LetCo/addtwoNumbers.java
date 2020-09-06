package LetCo;

import java.util.LinkedList;
import java.util.List;

public class addtwoNumbers {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(4);
        list.add(3);

        List<Integer> list1 = new LinkedList<>();
        list1.add(5);
        list1.add(6);
        list1.add(4);
      //  list.stream().
        String s = ((list.stream().map(x -> String.valueOf(x)).reduce((x, y) -> y.concat(x)))).get();
        String s1 = list1.stream().map(x -> String.valueOf(x)).reduce((x, y) -> y.concat(x)).get();
        Integer.valueOf(s);
        System.out.println(Integer.valueOf(s));
        System.out.println(Integer.valueOf(s1));
        System.out.println(Integer.valueOf(s)+Integer.valueOf(s1));
        Integer int1 = Integer.valueOf(s)+Integer.valueOf(s1);
    }
}
