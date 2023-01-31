package leetcode.easy;

public class Q_796_RotateString {

    /*
     * Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
     * A shift on s consists of moving the leftmost character of s to the rightmost position.
     * For example, if s = "abcde", then it will be "bcdea" after one shift.
     *
     */

    public static void main(String[] args) {

    }

    public boolean rotateString(String s, String goal) {
        return (s.length() == goal.length() && (s + s).contains(goal));
    }
}
