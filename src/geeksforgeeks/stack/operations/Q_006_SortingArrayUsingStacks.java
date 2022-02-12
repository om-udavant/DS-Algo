package geeksforgeeks.stack.operations;

import java.util.Stack;

public class Q_006_SortingArrayUsingStacks {

    public static void main(String[] args){
        int arr[] = {10, 5, 15, 45};
        int n = arr.length;

        sortArray(arr, n);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void sortArray(int[] arr, int n) {

        Stack<Integer> input = new Stack<>();

        for(int i = 0; i < n; i++){
            input.push(arr[i]);
        }

        Stack<Integer> tempStack = sortStack(input);

        for (int i = 0; i < n; i++){
            arr[i] = tempStack.pop();
        }
    }

    private static Stack<Integer> sortStack(Stack<Integer> input) {
        Stack<Integer> tmpStack = new Stack<>();

        while (!input.isEmpty()){
            int tmp = input.pop();

            while (!tmpStack.isEmpty() && tmpStack.peek() < tmp){
                input.push(tmpStack.pop());
            }

            tmpStack.push(tmp);
        }
        return tmpStack;
    }
}
