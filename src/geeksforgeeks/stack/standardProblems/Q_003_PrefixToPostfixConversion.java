package geeksforgeeks.stack.standardProblems;

import java.util.Stack;

public class Q_003_PrefixToPostfixConversion {
    public static void main(String[] args){
        String exp = "*-A/BC-/AKL";
        System.out.println("Postfix : " + convert(exp));
    }

    private static String convert(String exp) {
        Stack<String> stack = new Stack<>();

        int length = exp.length();

        for (int i = length - 1; i >= 0; i--){
            char c = exp.charAt(i);
            if (isOperator(c)){
                String op1 = stack.pop();
                String op2 = stack.pop();

                String temp = op1 + op2 + c;
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
