package leetcode.easy;

import java.util.Arrays;

public class Q_561_ArrayPartition {

    /*
     * Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn)
     * such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
     *
     */

    public static void main(String[] args) {

    }

    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        int maxInt = 0;

        for (int i = 0; i < nums.length; i += 2) {
            maxInt += nums[i];
        }

        return maxInt;

    }
}
