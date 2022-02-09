package geeksforgeeks.stack.standardProblems;

import java.util.Stack;

public class Q_009_NextGreaterElement {

    public static void main(String[] args){

        int[] arr = { 4, 5, 2, 25};
        int size = arr.length;
        int[] nge = new int[size];

        nextGreater(arr, size, nge);

        printElement(arr, nge);
    }

    private static void printElement(int[] arr, int[] nge) {
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ---> " + nge[i]);
        }
    }

    private static void nextGreater(int[] arr, int size, int[] nge) {

        Stack<Integer> stack = new Stack<>();
        stack.push(size - 1);

        for(int i = size - 1; i >= 0; i--){
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]){
                stack.pop();
            }

            if(stack.isEmpty()){
                nge[i] = -1;
            }else {
                nge[i] = arr[stack.peek()];
            }

            stack.push(i);

        }
    }
}
