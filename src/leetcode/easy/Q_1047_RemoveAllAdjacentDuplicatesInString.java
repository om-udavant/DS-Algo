package leetcode.easy;

import java.util.Stack;

public class Q_1047_RemoveAllAdjacentDuplicatesInString {

    /*
     * You are given a string s consisting of lowercase English letters.
     * A duplicate removal consists of choosing two adjacent and equal letters and removing them.
     * We repeatedly make duplicate removals on s until we no longer can.
     * Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
     *
     */

    public static void main(String[] args) {

    }

    public String removeDuplicates(String s) {

        if (s.length() == 1) {
            return s;
        }

        Stack<Character> stack = new Stack<>();

        for (char i : s.toCharArray()) {

            if (stack.isEmpty()) {
                stack.push(i);
            } else if (stack.peek() == i) {
                stack.pop();
            } else {
                stack.push(i);
            }

        }

        StringBuilder str = new StringBuilder();

        for (char c : stack) {
            str.append(c);
        }

        return str.toString();

    }
}
