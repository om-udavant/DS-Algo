package geeksforgeeks.stack.operations;

import java.util.Stack;

public class Q_003_SortStackUsingTemporaryStack {

    public static void main(String[] args){

        Stack<Integer> stack = new Stack<>();

        stack.add(34);
        stack.add(3);
        stack.add(31);
        stack.add(98);
        stack.add(92);
        stack.add(23);

        Stack<Integer> tempStack = sortStack(stack);
        System.out.println("Sorted numbers are: ");

        while (!tempStack.isEmpty()){
            System.out.print(tempStack.pop() + " ");
        }
    }

    private static Stack<Integer> sortStack(Stack<Integer> stack) {

        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()){
            int tmp = stack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > tmp){
                stack.push(tempStack.pop());
            }

            tempStack.push(tmp);
        }
        return tempStack;
    }
}
