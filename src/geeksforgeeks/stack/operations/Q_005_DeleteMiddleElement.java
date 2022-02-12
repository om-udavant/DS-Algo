package geeksforgeeks.stack.operations;

import java.util.Stack;

public class Q_005_DeleteMiddleElement {

    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args){

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        deleteMiddle(stack.size(), 0);

        System.out.println("After deleteing middle element");
        while (!stack.isEmpty()){
            int x = stack.pop();
            System.out.print(x + " ");
        }
    }

    private static void deleteMiddle(int size, int current) {

        if (stack.isEmpty() || current == size){
            return;
        }

        int x = stack.pop();

        deleteMiddle(size, current + 1);

        if(current != size / 2){
            stack.push(x);
        }
    }
}
