package geeksforgeeks.stack.operations;

import java.util.Stack;

public class Q_001_ReverseStackUsingRecursion {

    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args){

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack ");
        System.out.println(stack);

        reverse();

        System.out.println("Reverse Stack ");
        System.out.println(stack);
    }

    private static void reverse() {

        if(stack.size() > 0){
            int x = stack.pop();
            reverse();
            insertAtBottom(x);
        }
    }

    private static void insertAtBottom(int x) {

        if(stack.isEmpty()){
            stack.push(x);
        }else {
            int a = stack.pop();
            insertAtBottom(x);
            stack.push(a);
        }
    }
}
