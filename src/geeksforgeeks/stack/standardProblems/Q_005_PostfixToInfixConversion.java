package geeksforgeeks.stack.standardProblems;

import java.util.Stack;

public class Q_005_PostfixToInfixConversion {

    public static void main(String[] args){
        String exp = "ab*c+";
        System.out.println(getInfix(exp));
    }

    private static String getInfix(String exp) {

        Stack<String> stack = new Stack<>();

        for(int i = 0; i < exp.length(); i++){

            char c = exp.charAt(i);

            if (isOperand(c)){
                stack.push(c + "");
            }else {
                String op1 = stack.pop();
                String op2 = stack.pop();

                stack.push("(" + op2 + c + op1 + ")");
            }
        }
        return stack.pop();
    }

    private static boolean isOperand(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
