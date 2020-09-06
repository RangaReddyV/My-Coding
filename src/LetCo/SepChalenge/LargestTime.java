package LetCo.SepChalenge;

public class LargestTime {
    private int maxTime = -1;

    public String largestTimeFromDigits(int[] A) {

        getAllPermutations(A, 0);
        return maxTime == -1 ? "": String.format("%02d:%02d", maxTime/60, maxTime%60);
    }

    private void getAllPermutations(int[] a, int start) {
        if (a.length == start) {
            generateTime(a);
            return;
        }
        for(int i = start ; i <a.length ; i++){
          swap(a , i , start);
          getAllPermutations(a , start+1);
          swap(a, i , start);
        }
    }

    private void swap(int a[] , int i , int j){
        if (i != j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    private void generateTime(int[] a) {
        int hour = a[0] * 10 + a[1];
        int minutes = a[2] * 10 + a[3];
        if (hour < 24 && minutes < 60)
            maxTime = Math.max(maxTime, hour * 60 + minutes);
    }

    public static void main(String[] args) {
        LargestTime time = new LargestTime();
        System.out.println(time.largestTimeFromDigits(new int[]{0, 0, 0, 0}));
    }
}
