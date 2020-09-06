package LetCo;

import java.util.*;
import java.util.stream.Collectors;

public class GroupOfAnagrams {

    public static void main(String[] args) {
        String [] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(str).forEach(System.out::println);
        Timeit.code(() ->
            groupAnagrams(str));
        Timeit.code(() ->
                groupAnagrams1(str));
    }


    private static List<List<String>> groupAnagrams(String[] str) {
        //List<List<String>> list = new ArrayList<>();
        List<List<String>> list  = new ArrayList<>( Arrays.stream(str)
                .collect(Collectors.groupingBy(GroupOfAnagrams::sorted ))
                .values());
        List<String> li = new ArrayList<>();
        li.stream().collect(Collectors.groupingBy(GroupOfAnagrams::sorted)).values();
       // .forEach( (k,v) -> list.add((v)));


        return list;
    }
    private static String sorted(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

        private static  List<List<String>>  groupAnagrams1(String[] strs) {
            if (strs.length == 0) return new ArrayList();
            Map<String, List> ans = new HashMap<String, List>();
            int[] count = new int[26];
            for (String s : strs) {
                Arrays.fill(count, 0);
                for (char c : s.toCharArray()) count[c - 'a']++;

                StringBuilder sb = new StringBuilder("");
                for (int i = 0; i < 26; i++) {
                    sb.append('#');
                    sb.append(count[i]);
                }
                String key = sb.toString();
                if (!ans.containsKey(key)) ans.put(key, new ArrayList());
                ans.get(key).add(s);
            }
            return new ArrayList(ans.values());
    }
}
