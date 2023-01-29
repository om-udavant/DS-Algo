package leetcode.easy;

import java.util.ArrayList;

public class Q_748_ShortestCompletingWord {

    /*
     * Given a string licensePlate and an array of strings words, find the shortest completing word in words.
     * A completing word is a word that contains all the letters in licensePlate. Ignore numbers and spaces in licensePlate,
     * and treat letters as case insensitive. If a letter appears more than once in licensePlate,
     * then it must appear in the word the same number of times or more.
     * For example, if licensePlate = "aBc 12c", then it contains letters 'a', 'b' (ignoring case), and 'c' twice.
     * Possible completing words are "abccdef", "caaacab", and "cbca".
     * Return the shortest completing word in words. It is guaranteed an answer exists. If there are multiple shortest completing words,
     * return the first one that occurs in words.
     *
     */

    public static void main(String[] args) {

    }

    public String shortestCompletingWord(String licensePlate, String[] words) {

        licensePlate = licensePlate.replaceAll("[0-9\s]", "").toLowerCase();

        int[] chars = new int[26];
        ArrayList<String> list = new ArrayList<>();

        for (char c : licensePlate.toCharArray()) {
            chars[c - 'a']++;
        }

        for (String word : words) {
            int[] dummy = new int[26];
            boolean found = true;
            for (char c : word.toCharArray()) {
                dummy[c - 'a']++;
            }

            for (int i = 0; i < chars.length; i++) {
                if (dummy[i] < chars[i]) {
                    found = false;
                    break;
                }
            }

            if (found) {
                list.add(word);
            }
        }

        int min = Integer.MAX_VALUE;
        int pos = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < min) {
                pos = i;
                min = list.get(i).length();
            }
        }

        return list.get(pos);

    }
}
