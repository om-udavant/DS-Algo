package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class Q_888_FairCandySwap {

    /*
     * Alice and Bob have a different total number of candies. You are given two integer arrays aliceSizes and bobSizes where
     * aliceSizes[i] is the number of candies of the ith box of candy that Alice has and bobSizes[j] is the number of candies
     * of the jth box of candy that Bob has.
     * Since they are friends, they would like to exchange one candy box each so that after the exchange, they both have the
     * same total amount of candy. The total amount of candy a person has is the sum of the number of candies in each box they have.
     * Return an integer array answer where answer[0] is the number of candies in the box that Alice must exchange, and answer[1]
     * is the number of candies in the box that Bob must exchange. If there are multiple answers, you may return any one of them.
     * It is guaranteed that at least one answer exists.
     *
     */

    public static void main(String[] args) {

    }

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int totalA = 0;
        int totalB = 0;
        int[] result = new int[2];
        Set<Integer> setB = new HashSet();

        for (int i : aliceSizes) {
            totalA += i;
        }

        for (int i : bobSizes) {
            totalB += i;
            setB.add(i);
        }

        int temp = (totalB - totalA) / 2;

        for (int a : aliceSizes) {
            if (setB.contains(a + temp)) {
                result[0] = a;
                result[1] = a + temp;
                return result;
            }
        }

        return null;

    }
}
