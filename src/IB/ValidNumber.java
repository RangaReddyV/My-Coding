package IB;

import java.util.regex.Pattern;

public class ValidNumber {
    public int isNumber(final String A) {
        String s = A.trim();
        Long.parseLong("two");
        try {
            new java.math.BigDecimal(s);
        }
        catch(NumberFormatException e){
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        ValidNumber vn = new ValidNumber();
        System.out.println(vn.isNumber(" 3."));
    }
}
