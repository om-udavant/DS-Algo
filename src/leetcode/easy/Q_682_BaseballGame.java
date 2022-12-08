package leetcode.easy;

import java.util.Stack;

public class Q_682_BaseballGame {

    /*
     *You are keeping the scores for a baseball game with strange rules. At the beginning of the game,
     * you start with an empty record.
     * You are given a list of strings operations, where operations[i] is the ith operation you must apply to the
     * record and is one of the following:
     *   -An integer x.
     *    Record a new score of x.
     *   -'+'.
     *    Record a new score that is the sum of the previous two scores.
     *   -'D'.
     *    Record a new score that is the double of the previous score.
     *   -'C'.
     *    Invalidate the previous score, removing it from the record.
     * Return the sum of all the scores on the record after applying all the operations.
     * The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer
     * and that all operations are valid.
     *
     */

    public static void main(String[] args) {

    }

    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack();

        for (String s : operations) {

            if (s.equals("+")) {
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
            } else if (s.equals("C")) {
                stack.pop();
            } else if (s.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(s));
            }

        }

        int ans = 0;
        for (int score : stack) {
            ans += score;
        }

        return ans;

    }
}
