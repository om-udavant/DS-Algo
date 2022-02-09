package geeksforgeeks.stack.standardProblems;

import java.util.Stack;

public class Q_008_CheckForBalancedBracketsExpression {

    public static void main(String[] args){
        String exp = "[()]{}{[()()]()}";

        if (areBracketsBalanced(exp)){
            System.out.println("Balanced");
        }else {
            System.out.println("Not Balanced");
        }
    }

    private static boolean areBracketsBalanced(String exp) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++){
            char x = exp.charAt(i);

            if (x == '(' || x == '[' || x == '{'){
                stack.push(x);
            }

            if (stack.isEmpty()){
                return false;
            }
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '['){
                        return false;
                    }
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '['){
                        return false;
                    }
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '{' || check == '('){
                        return false;
                    }
                    break;
            }
        }

        return (stack.isEmpty());
    }
}
