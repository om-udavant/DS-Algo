package geeksforgeeks.stack.standardProblems;

import java.util.Arrays;
import java.util.Stack;

public class Q_007_StockSpanProblem {

    public static void main(String[] args){
        int[] price = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;
        int[] span = new int[n];

        calculateSpan(price, n, span);

        printSpan(span);
    }

    private static void printSpan(int[] span) {
        System.out.print(Arrays.toString(span));
    }

    private static void calculateSpan(int[] price, int n, int[] span) {

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i = 0; i < n; i++){
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]){
                stack.pop();
            }

            if (stack.isEmpty()){
                span[i] = i + 1;
            }else {
                span[i] = i - stack.peek();
            }
            stack.push(i);
        }
    }
}
