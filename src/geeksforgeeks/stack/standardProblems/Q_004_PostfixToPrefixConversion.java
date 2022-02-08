package geeksforgeeks.stack.standardProblems;

import java.util.Stack;

public class Q_004_PostfixToPrefixConversion {

    public static void main(String[] args){
        String exp = "ABC/-AK/L-*";
        System.out.println("Prefix : " + convert(exp));
    }

    private static String convert(String exp) {
        Stack<String> stack = new Stack<>();

        int length = exp.length();

        for (int i = 0; i < length; i++){
            char c = exp.charAt(i);
            if (isOperator(c)){
                String op1 = stack.pop();
                String op2 = stack.pop();

                String temp = c + op2 + op1;
                stack.push(temp);
            }else {
                stack.push(c + "");
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(char c) {
        switch (c){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                return true;
        }
        return false;
    }
}
