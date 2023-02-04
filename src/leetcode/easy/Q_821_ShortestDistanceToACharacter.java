package leetcode.easy;

public class Q_821_ShortestDistanceToACharacter {

    /*
     * Given a string s and a character c that occurs in s,
     * return an array of integers answer where answer.length == s.length and answer[i] is the distance
     * from index i to the closest occurrence of character c in s.
     * The distance between two indices i and j is abs(i - j), where abs is the absolute value function.
     *
     */

    public static void main(String[] args) {

    }

    public int[] shortestToChar(String s, char c) {

        int n = s.length();
        int pos = -n;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                pos = i;
            }
            res[i] = i - pos;
        }

        for (int i = pos - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                pos = i;
            }
            res[i] = Math.min(res[i], pos - i);
        }

        return res;
    }
}
