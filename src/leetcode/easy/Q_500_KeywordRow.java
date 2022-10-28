package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_500_KeywordRow {

    /*
     *
     * Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.
     * In the American keyboard:
     *   -The first row consists of the characters "qwertyuiop",
     *   -The second row consists of the characters "asdfghjkl",
     *   -The third row consists of the characters "zxcvbnm".
     *
     */

    public String[] findWords(String[] words) {

        char[] topRow = new char[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        char[] midRow = new char[]{'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        char[] bottomRow = new char[]{'z', 'x', 'c', 'v', 'b', 'n', 'm'};

        List<String> ans = new ArrayList<String>();

        for (int i = 0; i < words.length; i++) {

            char[] singleWord = words[i].toCharArray();
            int singleWordLength = singleWord.length;

            int checkTop = 0;
            int checkMid = 0;
            int checkBottom = 0;

            for (int j = 0; j < singleWordLength; j++) {

                if (contains(topRow, Character.toLowerCase(singleWord[j]))) {
                    checkTop++;
                }
                if (contains(midRow, Character.toLowerCase(singleWord[j]))) {
                    checkMid++;
                }
                if (contains(bottomRow, Character.toLowerCase(singleWord[j]))) {
                    checkBottom++;
                }
            }
            if (checkTop == singleWordLength) {
                ans.add(words[i]);
            }
            if (checkMid == singleWordLength) {
                ans.add(words[i]);
            }
            if (checkBottom == singleWordLength) {
                ans.add(words[i]);
            }

        }

        String[] finalAns = new String[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            finalAns[i] = ans.get(i);
        }

        return finalAns;
    }

    public boolean contains(char[] arr, char target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return true;
        }
        return false;
    }
}
