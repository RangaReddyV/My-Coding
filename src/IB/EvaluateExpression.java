package IB;

import java.util.ArrayList;
import java.util.Stack;

public class EvaluateExpression {

    public int evalExpr(ArrayList<String> A){
        Stack<Integer> stack = new Stack<>();
        for (String s : A){
            if ("+-*/".contains(s)){
                int x = stack.pop();
                int y = stack.pop();
                if(s.equals("+")){
                    stack.push(x+y);
                }
                if(s.equals("-")){
                    stack.push(x-y);
                }
                if(s.equals("*")){
                    stack.push(x*y);
                }
                if(s.equals("/")){
                    stack.push(x/y);
                }
            }
            else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        EvaluateExpression eval = new EvaluateExpression();
        ArrayList<String> arr = new ArrayList<>();
        arr.add("2");
    }
}
