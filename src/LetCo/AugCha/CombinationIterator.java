package LetCo.AugCha;

import java.util.ArrayList;
import java.util.List;

public class CombinationIterator {
    private List<String> combinations;
    public CombinationIterator(String characters, int combinationLength) {
        combinations = new ArrayList<>();
        char [] ch = characters.toCharArray();
        for (int i=0; i < ch.length; i++) {
            generateAllCombinations(combinations, ch, combinationLength, i , new String());
        }
    }

    private void generateAllCombinations(List<String> combinations, char[] ch, int combinationLength, int index, String s) {
        s = s+ch[index];
        if(s.length() == combinationLength){
            combinations.add(s);
            return;
        }
        for (int j=index+1; j < ch.length; j++){
            generateAllCombinations(combinations, ch, combinationLength,j , new String(s));
        }
    }


    public String next() {
        String s = null;
        if(!combinations.isEmpty()) {
             s = combinations.get(0);
            combinations.remove(0);
        }
        return  s;

    }

    public boolean hasNext() {
        return !combinations.isEmpty();
    }

    public static void main(String[] args) {
        CombinationIterator cin = new CombinationIterator("abcd" , 3);
        System.out.println(cin.next());
        System.out.println(cin.hasNext());
        System.out.println(cin.next());
        System.out.println(cin.hasNext());
        System.out.println(cin.next());
        System.out.println(cin.hasNext());
    }
}
