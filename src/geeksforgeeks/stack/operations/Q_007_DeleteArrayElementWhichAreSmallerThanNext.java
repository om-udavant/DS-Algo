package geeksforgeeks.stack.operations;

import java.util.Stack;

public class Q_007_DeleteArrayElementWhichAreSmallerThanNext {

    public static void main(String[] args){
        int n = 5, k = 2;
        int arr[] = {20, 10, 25, 30, 40};
        deleteElements(arr, n, k);
    }

    private static void deleteElements(int[] arr, int n, int k) {

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        int count = 0;

        for (int i = 1; i < n; i++){

            while (!stack.isEmpty() && stack.peek() < arr[i] && count < k){
                stack.pop();
            }
            count++;
            stack.push(arr[i]);
        }

        int m = stack.size();
        Integer[] v = new Integer[m];

        while (!stack.isEmpty()){
            v[--m] = stack.pop();
        }

        for (Integer x : v){
            System.out.print(x + " ");
        }
    }
}
