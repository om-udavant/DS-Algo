package leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q_989_AddToArrayFormOfInteger {

    /*
     * The array-form of an integer num is an array representing its digits in left to right order.
     *   - For example, for num = 1321, the array form is [1,3,2,1].
     * Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
     *
     */

    public static void main(String[] args) {

    }

    public List<Integer> addToArrayForm(int[] num, int k) {

        Stack<Integer> stack = new Stack<>();
        int carry = k;

        int i = num.length - 1;
        while (i >= 0 || carry > 0) {
            if (i >= 0) {
                carry += num[i];
            }

            stack.push(carry % 10);

            carry /= 10;
            i--;
        }

        List<Integer> result = new ArrayList<>();
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;

    }
}
