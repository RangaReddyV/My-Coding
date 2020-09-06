package LetCo.AugCha;

public class GoatLatin {

    public String toGoatLatin(String S) {
        String result = "";
        String arr[] = S.split("\\s");
        String aChar = "";
        for (String s : arr) {
            char ch = s.charAt(0);
            aChar += "a";
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
                s += "ma";
            } else {
                s = s.substring(1) + s.charAt(0) + "ma";
            }
            result += s + aChar + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        GoatLatin goatLatin = new GoatLatin();
        System.out.println(goatLatin.toGoatLatin("I speak Goat Latin"));

    }
}
