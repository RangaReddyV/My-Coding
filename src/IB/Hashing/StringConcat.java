package IB.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StringConcat {

    public ArrayList<Integer> findSubstring(String A, final List<String> B) {
        int lenWord = B.get(0).length();
        int noOfWords = B.size();
        int noOfChars = lenWord * noOfWords;
        HashMap<String, Integer> originalWordsMap = new HashMap<>();
        for (String word : B) {
            originalWordsMap.put(word, originalWordsMap.getOrDefault(word, 0) + 1);
        }
        int sizeOfString = A.length();
        ArrayList<Integer> result = new ArrayList<>();
        if (noOfChars > sizeOfString)
            return result;
        for (int i = 0; i <= sizeOfString - noOfChars; i++) {
            HashMap<String, Integer> tempMap = (HashMap<String, Integer>) originalWordsMap.clone();
            int j = i, count = noOfWords;
            while (j < i + noOfChars) {
                String word = A.substring(j, j + lenWord);
                if (!originalWordsMap.containsKey(word) || tempMap.get(word) == 0)
                    break;
                else {
                    tempMap.put(word, tempMap.get(word) - 1);
                    count--;
                }
                j += lenWord;
            }
            if (count == 0)
                result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        StringConcat stringConcat = new StringConcat();
        System.out.println(stringConcat.findSubstring("barfoothefoobarman" , Arrays.asList("foo" , "bar")));
    }
}
