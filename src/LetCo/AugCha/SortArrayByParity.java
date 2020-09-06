package LetCo.AugCha;

import java.util.stream.Stream;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {

        int res [] = new int [A.length];
        int start =0;
        int end = A.length -1;
        for (int i=0; i < A.length; i++){
           // System.out.println(A[i]);
            if (A[i]%2 == 0) {
                System.out.println("sdfdsf");
                res[start] = A[i];
                start++;
            }
            else {
                res[end] = A[i];
                System.out.println("hefe"+res[end]);
                end--;

            }
        }

        Stream.of(res).forEach(System.out::println);
        for (int i : res){
            System.out.println(i);
        }
        return res;
    }
    public static void main(String[] args) {
        SortArrayByParity sort = new SortArrayByParity();
        System.out.println(sort.sortArrayByParity(new int[] {3,1,2,4}));
    }

}
