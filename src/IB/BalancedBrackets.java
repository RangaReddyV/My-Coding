package IB;

import java.util.Stack;

public class BalancedBrackets {
    public int solve(String p) {
        /*if(A.length()%2 !=0 || A.charAt(0) == ')')
            return 0;*/
       /* int count=0 , leftbracket =0, rightbracket =0;
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        for (int i=0; i < A.length(); i++){
            if(A.charAt(i)=='('){
               ++leftbracket;
               left.push(A.charAt(i));
            }
            else {
                right.push(A.charAt(i));
                ++rightbracket;
            }
        }
        int size = rightbracket > leftbracket ? rightbracket : leftbracket;
        if (rightbracket > leftbracket){

        }
        if(st.isEmpty()) return  0;
        else {
            for (int i=0; i < st.size(); i++){
               char ch = st.peek();
               if(ch == '('){
                   count = count +2;
                   st.pop();
               }
               else {
                   st.pop();
                   st.pop();
                   ++count;
               }
            }
        }
        return count+1;*/
        int bal = 0;
        int ans = 0;

        for (int i = 0; i < p.length(); ++i) {

            bal += p.charAt(i) == '(' ? 2 : -1;

            // It is guaranteed bal >= -1
            if (bal == -1) {
                ans += 1;
                bal += 1;
            }
        }

        return bal + ans;
    }

    public static void main(String[] args) {
        BalancedBrackets bb = new BalancedBrackets();
        System.out.println(bb.solve("))())(")); //3
        System.out.println(bb.solve("((((((")); //12
        System.out.println(bb.solve(")))))))")); //5

    }
}
