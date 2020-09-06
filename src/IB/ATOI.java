package IB;

public class ATOI {

    public int atoinum(String s){
        System.out.println(s.trim());
        s = s.trim();
        s.indexOf(s);
        boolean sign = false;
        if (s.charAt(0)=='+' || s.charAt(0)=='-'){
            if (s.charAt(0)=='-'){
                sign = true;
            }
            s = s.substring(1,4);
        }
        double num =0;
        for (int i=0; i < s.length(); i++){
            int ch = s.charAt(i);
            if (Character.isDigit(ch)){
               int temp = ch - '0';
               System.out.println(temp);
               num = num*10 + temp;
               System.out.println(num);
            }else {
                break;
            }
        }
        System.out.println(num);
        if(sign){
            num = -1*num;
        }
        if (num > Integer.MAX_VALUE){
            return  Integer.MAX_VALUE;
        }
        if (num < Integer.MIN_VALUE){
            return  Integer.MIN_VALUE;
        }
        System.out.println(sign+" "+(sign==true));
        return (int) num;
    }
    public static void main(String[] args) {
        ATOI at = new ATOI();
        System.out.println(at.atoinum("-54332872018247709407 4 54"));
    }
}
