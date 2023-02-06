package leetcode.easy;

public class Q_859_BuddyStrings {

    /*
     * Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.
     * Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].
     *  -For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
     *
     */

    public static void main(String[] args) {

    }

    public boolean buddyStrings(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {

            int[] count = new int[26];

            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
                if (count[s.charAt(i) - 'a'] > 1) {
                    return true;
                }
            }

            return false;

        } else {

            int first = -1;
            int second = -1;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (first == -1) {
                        first = i;
                    } else if (second == -1) {
                        second = i;
                    } else {
                        return false;
                    }
                }
            }

            return (second != -1 && s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first));
        }

    }
}
