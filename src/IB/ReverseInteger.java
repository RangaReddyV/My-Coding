package IB;

public class ReverseInteger {

    public int reverse(int A) {
        StringBuffer sb = new StringBuffer();
        if ( A < 0){
            sb.append("-");
        }
        A = Math.abs(A);
        while(A>0){
            sb.append(A%10);
            A = A/10;
        }
        int number = Integer.valueOf(String.valueOf(sb));
        return number;
    }

    public static void main(String[] args) {
        ReverseInteger rs =new ReverseInteger();
        rs.reverse(-1146467285);
    }
}

