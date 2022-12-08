package leetcode.easy;

public class Q_680_ValidPalindromeII {

    /*
     * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
     *
     */

    public static void main(String[] args) {

    }

    public boolean validPalindrome(String s) {

        char[] a = s.toCharArray();
        int i = 0, j = a.length - 1;

        while (i < j) {

            if (a[i] == a[j]) {
                i++;
                j--;
            } else {
                return (isValidPalindrome(a, i, j - 1) || isValidPalindrome(a, i + 1, j));
            }

        }

        return true;

    }

    public boolean isValidPalindrome(char[] a, int i, int j) {

        while (i < j) {

            if (a[i] == a[j]) {
                i++;
                j--;
            } else {
                return false;
            }

        }

        return true;

    }
}
