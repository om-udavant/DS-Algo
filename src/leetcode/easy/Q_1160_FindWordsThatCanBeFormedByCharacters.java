package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Q_1160_FindWordsThatCanBeFormedByCharacters {

    /*
     *
     * You are given an array of strings words and a string chars.
     * A string is good if it can be formed by characters from chars (each character can only be used once).
     * Return the sum of lengths of all good strings in words.
     *
     */

    public static void main(String[] args) {

    }

    public int countCharacters(String[] words, String chars) {

        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (isGood(words[i], chars)) {
                count += words[i].length();
            }
        }

        return count;

    }

    public boolean isGood(String word, String chars) {

        Map<Character, Integer> hm = new HashMap<>();
        for (char c : chars.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (hm.containsKey(ch) && hm.get(ch) > 0) {
                hm.put(ch, hm.get(ch) - 1);
            } else {
                return false;
            }
        }

        return true;

    }

}
