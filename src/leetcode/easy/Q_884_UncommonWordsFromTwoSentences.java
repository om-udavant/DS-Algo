package leetcode.easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Q_884_UncommonWordsFromTwoSentences {

    /*
     * A sentence is a string of single-space separated words where each word consists only of lowercase letters.
     * A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
     * Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.
     *
     */

    public static void main(String[] args) {

    }

    public String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String, Integer> count = new HashMap<>();

        for (String word : s1.split(" ")) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        for (String word : s2.split(" ")) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        List<String> ans = new LinkedList<>();
        for (String word : count.keySet()) {
            if (count.get(word) == 1) {
                ans.add(word);
            }
        }

        return ans.toArray(new String[ans.size()]);

    }
}
