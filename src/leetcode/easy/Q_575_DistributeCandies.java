package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class Q_575_DistributeCandies {

    /*
     * Alice has n candies, where the ith candy is of type candyType[i].
     * Alice noticed that she started to gain weight, so she visited a doctor.
     * The doctor advised Alice to only eat n / 2 of the candies she has (n is always even).
     * Alice likes her candies very much, and she wants to eat the maximum number of different types of
     * candies while still following the doctor's advice.
     * Given the integer array candyType of length n, return the maximum number of different types of
     * candies she can eat if she only eats n / 2 of them.
     *
     */

    public static void main(String[] args) {

    }

    public int distributeCandies(int[] candyType) {

        Set<Integer> set = new HashSet<>();
        int n = candyType.length / 2;

        for (int i : candyType) {
            set.add(i);
            if (set.size() == n) {
                break;
            }
        }

        return set.size();

    }
}
