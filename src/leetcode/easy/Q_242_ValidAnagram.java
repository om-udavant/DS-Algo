package leetcode.easy;

import java.util.Arrays;

public class Q_242_ValidAnagram {

    /*
     *
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
     * typically using all the original letters exactly once.
     *
     * */

    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != t1[i]) {
                return false;
            }
        }

        return true;

    }

}
