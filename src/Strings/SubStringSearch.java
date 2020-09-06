package Strings;

import LetCo.Timeit;

public class SubStringSearch {


    public int bruteForceApproach(String txt, String pattern) {
        int txtlen = txt.length();
        int patLen = pattern.length();
        int j, i;
        for (i = 0, j = 0; i < txtlen && j < patLen; i++) {
        //    System.out.println("sf");
            if (txt.charAt(i) == pattern.charAt(j)) j++;
            else {
                i -= j;
                j = 0;
            }
        }
        if (j == patLen)
            return i - patLen;
        return -1;
    }

    public int kmpSearch(String txt, String pattern) {

        int dfa[][] = buildDFA(pattern);
        int i, j, txtLen = txt.length(), patLen = pattern.length();
        for (i = 0, j = 0; i < txtLen && j < patLen; i++)
            j = dfa[txt.charAt(i)][j];
        if (j == patLen) return i - patLen;
        return -1;
    }

    private int[][] buildDFA(String patern) {
        int len = patern.length();
        int dfa[][] = new int[256][len];
        dfa[patern.charAt(0)][0] = 1;

        for (int x = 0, j = 1; j < len; j++) {
            for (int c = 0; c < 256; c++)
                dfa[c][j] = dfa[c][x];
            dfa[patern.charAt(j)][j] = j + 1;
            x = dfa[patern.charAt(j)][x];
            System.out.println(x);
        }

        return dfa;
    }

    public static void main(String[] args) {
        SubStringSearch search = new SubStringSearch();
        Timeit.code(() ->System.out.println(search.bruteForceApproach("bcababcbababac", "ababac")));
        Timeit.code(() ->System.out.println(search.kmpSearch("bcababcbababac", "ababac")));
    }
}
