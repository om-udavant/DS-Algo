package leetcode.easy;

import java.util.Stack;

public class Q_844_BackspaceStringCompare {

    /*
     * Given two strings s and t, return true if they are equal when both are typed into empty text editors.
     * '#' means a backspace character.
     * Note that after backspacing an empty text, the text will continue empty.
     *
     */

    public static void main(String[] args) {

    }

    public boolean backspaceCompare(String s, String t) {

        Stack<Character> s1 = new Stack();
        Stack<Character> s2 = new Stack();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#' && !s1.empty()) {
                s1.pop();
            } else if (s.charAt(i) != '#') {
                s1.push(s.charAt(i));
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#' && !s2.empty()) {
                s2.pop();
            } else if (t.charAt(i) != '#') {
                s2.push(t.charAt(i));
            }
        }

        return s1.equals(s2);

    }
}
