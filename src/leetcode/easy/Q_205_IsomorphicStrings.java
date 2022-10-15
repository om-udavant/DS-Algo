package leetcode.easy;

import java.util.HashMap;

public class Q_205_IsomorphicStrings {

    /*
     *
     * Given two strings s and t, determine if they are isomorphic.
     * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
     * All occurrences of a character must be replaced with another character while preserving
     * the order of characters. No two characters may map to the same character,
     * but a character may map to itself.
     *
     * */

    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (Integer i = 0; i < s.length(); i++) {
            if (map1.put(s.charAt(i), i) != map2.put(t.charAt(i), i)) {
                return false;
            }
        }

        return true;

    }
}
