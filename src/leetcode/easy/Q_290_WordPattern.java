package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Q_290_WordPattern {

    /*
     *
     * Given a pattern and a string s, find if s follows the same pattern.
     * Here follow means a full match, such that there is a bijection between a
     * letter in pattern and a non-empty word in s.
     *
     * */

    public static void main(String[] args) {

    }

    public boolean wordPattern(String pattern, String s) {

        String[] word = s.split(" ");
        if (word.length != pattern.length()) {
            return false;
        }

        Map map = new HashMap<>();

        for (Integer i = 0; i < word.length; i++) {

            if (map.put(pattern.charAt(i), i) != map.put(word[i], i)) {
                return false;
            }

        }

        return true;

    }
}
