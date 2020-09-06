package LetCo;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1}, {1,0,1} , {1,1,1}};
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        makeZero(arr);
    }

    private static void makeZero(int[][] arr) {
        int [] row_matrix = new int[arr.length];
        int [] col_matrix = new int[arr[0].length];

        for (int i =0 ; i<arr.length ; i++){
            for (int j=0 ; j<arr[0].length ; j++){
                if (arr[i][j]==0){
                    row_matrix[i] = 1;
                    col_matrix[j] = 1;
                }
            }
        }
        for (int i =0 ; i<arr.length ; i++){
            for (int j=0 ; j<arr[0].length ; j++){
               if(row_matrix[i]==1 || col_matrix[j] == 1){
                   arr[i][j] = 0;
               }
            }
        }

        for (int i =0 ; i<arr.length ; i++){
            for (int j=0 ; j<arr[0].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
