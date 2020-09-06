package IB;

public class SqrtNumber {
   static int sqrtNumber(int A){
       if (A==1) return 1;
       for (int i=2; i<Math.sqrt(A)+1;i++){
           double x = Math.round((Math.pow(A, (1.0/i)))*10000d)/10000d;
           double y = Math.round((Math.pow(A,(1.0/i)))*10000d)/10000d;
           System.out.println(x);
           if (x%1==0){
               return 1;
           }
       }
       return 0;
    }
    public static void main(String[] args) {
        System.out.println(sqrtNumber(2));
    }
}
