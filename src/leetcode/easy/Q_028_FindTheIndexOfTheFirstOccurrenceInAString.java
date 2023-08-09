package leetcode.easy;

public class Q_028_FindTheIndexOfTheFirstOccurrenceInAString {

    /*
     * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
     * or -1 if needle is not part of haystack.
     *
     */

    public static void main(String[] args) {

    }

    public int strStr(String haystack, String needle) {

        int h = haystack.length();
        int n = needle.length();
        int nIndex = 0;

        for (int i = 0; i < h; i++) {
            if (haystack.charAt(i) == needle.charAt(nIndex)) {
                nIndex++;
            } else {
                i = i - nIndex;
                nIndex = 0;
            }

            if (nIndex == n) {
                return i - n + 1;
            }
        }

        return -1;

    }
}
