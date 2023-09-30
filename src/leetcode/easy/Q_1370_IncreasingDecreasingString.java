package leetcode.easy;

public class Q_1370_IncreasingDecreasingString {

    /*
     * You are given a string s. Reorder the string using the following algorithm:
     *    1) Pick the smallest character from s and append it to the result.
     *    2) Pick the smallest character from s which is greater than the last appended character to the result and append it.
     *    3) Repeat step 2 until you cannot pick more characters.
     *    4) Pick the largest character from s and append it to the result.
     *    5) Pick the largest character from s which is smaller than the last appended character to the result and append it.
     *    6) Repeat step 5 until you cannot pick more characters.
     *    7) Repeat the steps from 1 to 6 until you pick all characters from s.
     * In each step, If the smallest or the largest character appears more than once you can choose any occurrence and append
     * it to the result.
     * Return the result string after sorting s with this algorithm.
     *
     */

    public static void main(String[] args) {

    }

    public String sortString(String s) {

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            arr[index] = arr[index] + 1;
        }

        StringBuilder sb = new StringBuilder();

        while (sb.length() < s.length()) {

            for (int i = 0; i < 26; i++) {
                if (arr[i] > 0) {
                    char ch = (char) ('a' + i);
                    sb.append(ch);
                    arr[i]--;
                }
            }

            for (int i = 25; i >= 0; i--) {
                if (arr[i] > 0) {
                    char ch = (char) ('a' + i);
                    sb.append(ch);
                    arr[i]--;
                }
            }

        }

        return sb.toString();

    }
}
