package LetCo.AugCha;

public class DetectCapitl {
    public boolean detectCapitalUse(String word) {
        if (word.length()==1) return true;
        for (int i=0; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(1))){
                if(Character.isLowerCase(word.charAt(i))){
                    return false;
                }
            }
            else {
                if(i > 0 ) {
                    if (Character.isUpperCase(word.charAt(i))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        DetectCapitl dc  = new DetectCapitl();
        System.out.println(dc.detectCapitalUse("USA"));
        System.out.println(dc.detectCapitalUse("FlaG"));
        System.out.println(dc.detectCapitalUse("Leetcode"));
    }
}
