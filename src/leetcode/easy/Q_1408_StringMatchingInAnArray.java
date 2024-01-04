package leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q_1408_StringMatchingInAnArray {

    /*
     * Given an array of string words, return all strings in words that is a substring of another word.
     * You can return the answer in any order.
     * A substring is a contiguous sequence of characters within a string
     *
     */

    public static void main(String[] args) {

    }

    public List<String> stringMatching(String[] words) {

        Set<String> result = new HashSet<>();

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].contains(words[j])) {
                    result.add(words[j]);
                } else if (words[j].contains(words[i])) {
                    result.add(words[i]);
                }
            }
        }

        return new ArrayList<>(result);

    }
}
