package leetcode.easy;

public class Q_383_RansonNote {

    /*
     * Given two strings ransomNote and magazine, return true if ransomNote can be
     * constructed by using the letters from magazine and false otherwise.
     * Each letter in magazine can only be used once in ransomNote.
     * */

    public static void main(String[] args) {

    }

    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] alpha = new int[26];

        for (char n : magazine.toCharArray()) {
            alpha[n - 'a']++;
        }

        for (char n : ransomNote.toCharArray()) {
            if (alpha[n - 'a'] == 0) {
                return false;
            }
            alpha[n - 'a']--;
        }

        return true;

    }
}
