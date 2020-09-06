package LetCo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "pwwkew";
       int lon_sub = new LongestSubString().longestString(s);
      // System.out.println(lon_sub);
    }

    private int longestString(String s){


     /*  String sub =  Stream.of(s.split(""))
                .distinct()
                .collect(Collectors.joining());
         if(s.contains(sub)){
             return sub;
         }*/

     String output = "";
     String  str ="raang";
     Map<Character , Integer> map = new HashMap<>();
     for (int start =0, end =0; end <s.length() ; end++){
         Character ch = s.charAt(end);
         if(map.containsKey(ch)){
             start = Math.max(map.get(ch)+1, start);
         }
         if(output.length() < end-start+1){
             output = s.substring(start , end+1);
         }
        map.put(ch, end);
     }

        System.out.println(Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(c ->c , Collectors.counting())).keySet());
        Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(c ->c , Collectors.counting()));

        return output.length();
    }
}
