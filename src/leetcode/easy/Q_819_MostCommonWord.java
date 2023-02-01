package leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;

public class Q_819_MostCommonWord {

    /*
     *
     * Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned.
     * It is guaranteed there is at least one word that is not banned, and that the answer is unique.
     * The words in paragraph are case-insensitive and the answer should be returned in lowercase.
     */

    public static void main(String[] args) {

    }

    public String mostCommonWord(String paragraph, String[] banned) {

        HashSet<String> bWord = new HashSet();
        HashMap<String, Integer> vWord = new HashMap();

        for (String bbWord : banned) {
            bWord.add(bbWord);
        }

        String[] words = paragraph.toLowerCase().split("\\W+");

        for (String word : words) {
            if (!bWord.contains(word)) {
                vWord.put(word, vWord.getOrDefault(word, 0) + 1);
            }
        }

        int max = 0;
        String result = "";

        for (String word : vWord.keySet()) {
            if (vWord.get(word) > max) {
                max = vWord.get(word);
                result = word;
            }
        }

        return result;

    }
}
