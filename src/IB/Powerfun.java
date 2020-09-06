package IB;

import java.util.Stack;

public class Powerfun {

    int power(int x, int n , int d){
        System.out.println(Math.pow(x,n));
        Stack<Integer> st = new Stack<>();
        st.push(2);
        if ( x <0){
            x = d+x;
        }
        int power =  1;
        for (int i=1; i<=n ; i++){
            power = (power * x)%d;
        }

        return power;
    }
    public static void main(String[] args) {
        Powerfun pw= new Powerfun();
        System.out.println(pw.power(71045970,41535484,64735492));
    }
}
