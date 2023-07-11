package leetcode.easy;

import java.util.HashMap;

public class Q_1128_NumberOfEquivalentDominoPairs {

    /*
     * Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d] if and only if either (a == c and b == d),
     * or (a == d and b == c) - that is, one domino can be rotated to be equal to another domino.
     * Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is equivalent to dominoes[j].
     *
     */

    public static void main(String[] args) {

    }

    public int numEquivDominoPairs(int[][] dominoes) {

        int count = 0;

        HashMap<String, Integer> map = new HashMap<>();
        int i = 0;
        int n = dominoes.length;

        while (i < n) {
            String temp = "";
            if (dominoes[i][0] > dominoes[i][1]) {
                temp += dominoes[i][1];
                temp += dominoes[i][0];
            } else {
                temp += dominoes[i][0];
                temp += dominoes[i][1];
            }

            if (map.containsKey(temp)) {
                count += map.get(temp);
            }

            map.put(temp, map.getOrDefault(temp, 0) + 1);
            i++;
        }

        return count;
    }
}
