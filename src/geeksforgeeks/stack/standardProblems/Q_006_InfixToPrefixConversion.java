package geeksforgeeks.stack.standardProblems;

import java.util.Stack;

public class Q_006_InfixToPrefixConversion {

    public static void main(String[] args){
        String s = ("a+b*(c^d-e)^(f+g*h)-i");
        System.out.println(infixToPrefix(s.toCharArray()));
    }

    private static String infixToPrefix(char[] infix) {

        int l = infix.length;

        String infix1 = reverse(infix, 0, l - 1);
        infix = infix1.toCharArray();

        for (int i = 0; i < l; i++){
            if(infix[i] == '('){
                infix[i] = ')';
                i++;
            }
            else if (infix[i] == ')'){
                infix[i] = '(';
                i++;
            }
        }

        String prefix = infixToPostfix(infix);

        prefix = reverse(prefix.toCharArray(), 0, prefix.length() -1);

        return prefix;
    }

    private static String reverse(char[] str, int start, int end) {

        char temp;
        while (start < end){
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(str);
    }

    static String infixToPostfix(char[] exp) {

        String result = "";

        String infix = '(' + String.valueOf(exp) + ')';

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < infix.length(); i++){
            char c = infix.charAt(i);

            if (Character.isLetterOrDigit(c)){
                result += c;
            }else if (c == '('){
                stack.push(c);
            }else if (c == ')'){
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                stack.pop();

            }else {
                while (!stack.isEmpty() && prec(c) < prec(stack.peek())){
                    result += stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()){
            if(stack.peek() == '('){
                return "Invalid Expression";
            }
            result += stack.pop();
        }

        return result;
    }

    private static int prec(char c) {
        switch (c){
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
            case '%':
                return 3;
        }
        return -1;
    }
}
