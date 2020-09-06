package IB;

import java.util.ArrayList;

public class ExcelColumnNumber {
    public int excelNumber(String s){
        ArrayList<Integer> arr = new ArrayList<>();
        int num= s.charAt(0)-'A'+1;;
        if (s.length() ==1 ){
            return num;
        }
        for (int i=1; i<s.length();i++){
            num += s.charAt(i)-'A'+26;
        }
        return  num;
    }
    public static void main(String[] args) {
        ExcelColumnNumber exec= new ExcelColumnNumber();
        System.out.println(exec.excelNumber("AAB"));
    }
}
