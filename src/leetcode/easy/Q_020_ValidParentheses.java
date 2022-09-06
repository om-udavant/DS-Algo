package leetcode.easy;

import java.util.Stack;

public class Q_020_ValidParentheses {

    /*
     *
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
     * determine if the input string is valid.An input string is valid if:
     * 1.Open brackets must be closed by the same type of brackets.
     * 2.Open brackets must be closed in the correct order.
     * 3.Every close bracket has a corresponding open bracket of the same type.
     *
     * */

    public static void main(String[] args) {

    }

    public boolean isValid(String s) {

        char[] chars = s.toCharArray();
        Stack<Character> st = new Stack<>();

        for (char c : chars) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else {
                    char ch = st.peek();
                    if (c == ')' && ch == '(' || c == ']' && ch == '[' || c == '}' && ch == '{') {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();

    }
}
