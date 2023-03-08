package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Q_914_XOfAKindInADeckOfCards {

    /*
     * You are given an integer array deck where deck[i] represents the number written on the ith card.
     * Partition the cards into one or more groups such that:
     *   -Each group has exactly x cards where x > 1, and
     *   -All the cards in one group have the same integer written on them.
     * Return true if such partition is possible, or false otherwise.
     *
     */

    public static void main(String[] args) {

    }

    public boolean hasGroupsSizeX(int[] deck) {

        Map<Integer, Integer> count = new HashMap<>();
        int res = 0;

        for (int i = 0; i < deck.length; i++) {
            count.put(deck[i], count.getOrDefault(deck[i], 0) + 1);
        }

        for (int i : count.values()) {
            res = gcd(i, res);
        }

        return res > 1;
    }

    public int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }
}
