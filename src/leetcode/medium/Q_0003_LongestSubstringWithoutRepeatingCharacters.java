package leetcode.medium;

import java.util.HashSet;

public class Q_0003_LongestSubstringWithoutRepeatingCharacters {

    /*
     * Given a string s, find the length of the longest substring without repeating characters.
     *
     */

    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {

        int i = 0;
        int j = 0;
        int max = 0;

        HashSet<Character> set = new HashSet<>();

        while (j < s.length()) {

            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(s.charAt(i));
                i++;
            }

        }

        return max;

    }
}
