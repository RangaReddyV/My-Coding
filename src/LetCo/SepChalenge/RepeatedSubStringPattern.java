package LetCo.SepChalenge;

public class RepeatedSubStringPattern {

    public boolean repeatedSubstringPattern(String s) {

        for (int i=s.length()/2; i > 0 ; i--){
            if (s.length()%i ==0) {
                int repeat = s.length() / i;
                String s1  = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j=0 ; j < repeat; j++){
                    sb.append(s1);
                }
                if (sb.toString().equals(s))
                    return  true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        RepeatedSubStringPattern rp = new RepeatedSubStringPattern();
        System.out.println(rp.repeatedSubstringPattern("abab"));
    }
}
