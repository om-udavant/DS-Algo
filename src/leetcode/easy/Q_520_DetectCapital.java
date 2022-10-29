package leetcode.easy;

public class Q_520_DetectCapital {

    /*
     *
     * We define the usage of capitals in a word to be right when one of the following cases holds:
     *   -All letters in this word are capitals, like "USA".
     *   -All letters in this word are not capitals, like "leetcode".
     *   -Only the first letter in this word is capital, like "Google".
     * Given a string word, return true if the usage of capitals in it is right.
     *
     */

    public static void main(String[] args) {

    }

    public boolean detectCapitalUse(String word) {

        int cap = 0;

        for (char c : word.toCharArray()) {

            if (Character.isUpperCase(c)) {
                cap++;
            }

        }

        if (cap == word.length() || cap == 0) {
            return true;
        }

        return cap == 1 && Character.isUpperCase(word.charAt(0));

    }
}
