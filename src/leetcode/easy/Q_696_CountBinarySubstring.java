package leetcode.easy;

public class Q_696_CountBinarySubstring {

    /*
     * Given a binary string s, return the number of non-empty substrings that have the same number of 0's and 1's,
     * and all the 0's and all the 1's in these substrings are grouped consecutively.
     * Substrings that occur multiple times are counted the number of times they occur.
     *
     */

    public static void main(String[] args) {

    }

    public int countBinarySubstrings(String s) {
        int prev = 0;
        int curr = 1;
        int ans = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                ans += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            } else {
                curr++;
            }
        }

        return ans + Math.min(prev, curr);
    }
}
