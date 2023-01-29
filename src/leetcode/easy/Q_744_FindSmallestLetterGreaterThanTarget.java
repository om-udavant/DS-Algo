package leetcode.easy;

public class Q_744_FindSmallestLetterGreaterThanTarget {

    /*
     * You are given an array of characters letters that is sorted in non-decreasing order,
     * and a character target. There are at least two different characters in letters.
     * Return the smallest character in letters that is lexicographically greater than target.
     * If such a character does not exist, return the first character in letters.
     *
     */

    public static void main(String[] args) {

    }

    public char nextGreatestLetter(char[] letters, char target) {

        char c = target;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > c) {
                c = letters[i];
                return c;
            }
        }

        return letters[0];

    }
}
