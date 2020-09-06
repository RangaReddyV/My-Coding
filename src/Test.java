import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 4, 2, 9, 7, 45, 34, 98, 35, 23, 34, 2);

        String[] s = {"ranga", "reddy", "tibco", "ranga"};
        //  list.forEach (System.out::println);
        //   list.forEach(value -> System.out.println(value));
        Stream.of("ranga", "reddy", "tibco", "ranga")
                .distinct().forEach(System.out::println);
        Arrays.stream(s)
                .distinct()
                .forEach(System.out::println);
        List<Integer> li = Arrays.asList(1, 1, 1, 3, 3, 2, 2, 2, 2, 14, 14, 13);
        Map<Integer, Integer> map = new HashMap<>();
        li.forEach(k -> map.merge(k, 1, Integer::sum));
        map.forEach((k, v) -> System.out.print(k + " " + v + " "));
        System.out.println();
        li.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())).forEach((k, v) -> System.out.print(k + " " + v + " "));
        System.out.println();
        Timeit.code(() ->
        li.stream()
                .filter(e -> e % 2 == 0)
                .findFirst());
        li.stream()
                .filter(e -> e % 2 == 0)
                .mapToInt(Integer::valueOf)
                .sum();
      Map<Integer , Integer> colle=  list.stream()
               // .filter(e -> e%2==0)
                .collect(Collectors.toMap(Function.identity(),  e -> e , (e1, e2) -> e1));
      System.out.println(colle);
     list.stream()
              .collect(Collectors.groupingBy(c -> c , Collectors.counting())).forEach((k,v) ->System.out.print(k+" "+v+" "));
      //  System.out.println(sum);

        System.nanoTime();
        // unique.forEach(System.out::println);

        String s1 =" My name is rgangaredd and I'm working in tibco";
        List<String> lst = Arrays.asList(s1.split("\\PL"));
         lst.stream()
                .filter(words -> words.length() > 2)
                .findAny()
                ;
         Scanner sc = new Scanner(System.in);
         while(sc.hasNext()){
             list.add(sc.nextInt());
         }
         list.stream()
                 .collect(Collectors.groupingBy(e -> e , Collectors.counting()))
                 .forEach((k,v) -> System.out.println(k+" "+v+" "+" "));
       // Locale loc = Locale.forLanguageTag("en-US");
        System.out.println(Locale.getAvailableLocales());
    }


/**
 * starting 1577079051936
 * 344
 * ending 1577079052054
 *
 * starting 1577079093284
 * 344
 * ending 1577079093405
 */
}

class Timeit {

    public static void code(Runnable code){
        try {
            long start = System.nanoTime();
            code.run();
            long end = System.nanoTime();
            System.out.println((end-start)/1.0e9);
        }
        catch (Exception e){

        }
    }
}