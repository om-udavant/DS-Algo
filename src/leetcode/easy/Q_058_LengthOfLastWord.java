package leetcode.easy;

public class Q_058_LengthOfLastWord {

    /*
     *
     * Given a string s consisting of words and spaces, return the length of the last word in the string.
     * A word is a maximal substring consisting of non-space characters only.
     *
     * */

    public static void main(String[] args) {

    }

    public int lengthOfLastWord(String s) {

        s = s.trim();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return s.length() - 1 - i;
            }
        }
        return s.length();
    }
}
