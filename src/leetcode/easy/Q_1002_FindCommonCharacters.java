package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_1002_FindCommonCharacters {

    /*
     * Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates).
     * You may return the answer in any order.
     *
     */

    public static void main(String[] args) {

    }

    public List<String> commonChars(String[] words) {

        List<Character> list = new ArrayList<>();
        List<Character> temp = new ArrayList<>();

        for (char c : words[0].toCharArray()) {
            list.add(c);
        }

        for (int i = 1; i < words.length; i++) {

            for (int j = 0; j < words[i].length(); j++) {
                if (list.contains(words[i].charAt(j))) {
                    temp.add(words[i].charAt(j));
                    for (int k = 0; k < list.size(); k++) {
                        if (list.get(k) == words[i].charAt(j)) {
                            list.set(k, '0');
                            break;
                        }
                    }
                }
            }

            list.clear();
            list.addAll(temp);
            temp.clear();

        }

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String s = "" + list.get(i);
            ans.add(s);
        }

        return ans;

    }

}
