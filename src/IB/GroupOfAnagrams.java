package IB;

import java.util.*;

public class GroupOfAnagrams {
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        if (A.size() == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        int[] count = new int[26];
        for (int k=0; k< A.size(); k++) {
            Arrays.fill(count, 0);
            for (char c : A.get(k).toCharArray()) count[c - 'a']++;

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(k);
        }
        return new ArrayList(ans.values());
        //return  anagramsIndexs;
    }

    public static void main(String[] args) {
        GroupOfAnagrams gp = new GroupOfAnagrams();
        System.out.println(gp.anagrams(Arrays.asList("cat", "dog", "god", "tca")));
    }
}
