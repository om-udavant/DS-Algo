package leetcode.easy;

public class Q_392_IsSubsequence {

    /*
     *
     * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
     * A subsequence of a string is a new string that is formed from the original string by
     * deleting some (can be none) of the characters without disturbing the relative positions
     * of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
     * */

    public static void main(String[] args) {

    }

    public boolean isSubsequence(String s, String t) {

        if (s.length() == 0 && t.length() == 0) {
            return true;
        }
        if (t.length() == 0) {
            return false;
        }

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }

        }

        return (i == s.length());
    }
}
