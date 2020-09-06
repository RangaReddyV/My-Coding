package IB;

import java.math.BigInteger;

public class LargestNumber {
    public static void main(String[] args) {
        LargestNumber num = new LargestNumber();
        int arr[] = {0,0,0,0};
      //  num.findlargest( arr);
        System.out.println(num.findlargest(arr));
    }

    private String findlargest(int[] arr) {

        for (int i=0; i <arr.length-1 ; i++){
            for (int j=i+1; j < arr.length ;j++) {
                String s1 = String.valueOf(arr[i]) + String.valueOf(arr[j]);
                String s2 = String.valueOf(arr[j]) + String.valueOf(arr[i]);
                System.out.println(s1+" "+s2);
                if (s1.compareTo(s2) < 0) {
                    System.out.println("swap");
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        StringBuffer finalNumber = new StringBuffer();
        for (int a : arr){
            finalNumber.append(String.valueOf(a));
        }
        String s = String.valueOf(finalNumber).replaceAll("0","");
        if (s.length() == 0){
            return new String("0");
        }

        return String.valueOf(finalNumber);
    }

    private void swap(int i, int i1) {
    }
}
