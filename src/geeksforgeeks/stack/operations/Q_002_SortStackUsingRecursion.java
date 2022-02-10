package geeksforgeeks.stack.operations;

import java.util.Stack;

public class Q_002_SortStackUsingRecursion {

    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args){

        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);

        System.out.println("Original Stack");
        System.out.println(stack);

        sortStack();

        System.out.println("Sorted Stack");
        System.out.println(stack);
    }

    private static void sortStack() {

        if(stack.size() > 0){
            int x = stack.pop();
            sortStack();
            soretdInserted(x);
        }
    }

    private static void soretdInserted(int x) {

        if(stack.isEmpty() || x < stack.peek()){
            stack.push(x);
        }else {
            int temp = stack.pop();
            soretdInserted(x);
            stack.push(temp);
        }
    }
}
