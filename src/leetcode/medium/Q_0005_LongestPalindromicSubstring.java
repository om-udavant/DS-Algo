package leetcode.medium;

public class Q_0005_LongestPalindromicSubstring {

    /*
     * Given a string s, return the longest palindromic substring in s.
     *
     */

    public static void main(String[] args) {

    }

    public String longestPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;
        int start2 = 0;

        int len = Integer.MIN_VALUE;
        String res = "";

        while (start < s.length()) {

            while (start2 <= end) {

                if (isPalindrome(start2, end, s)) {

                    if (len >= (end - start2 + 1)) {
                        break;
                    }

                    res = s.substring(start2, end + 1);
                    len = end - start2 + 1;
                    break;

                }
                end--;
            }

            start2 = start + 1;
            start++;
            end = s.length() - 1;

        }

        return res;

    }

    public boolean isPalindrome(int start, int end, String s) {

        while (start < end) {

            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;

        }

        return true;

    }
}
