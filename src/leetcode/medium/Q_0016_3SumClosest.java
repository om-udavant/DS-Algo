package leetcode.medium;

import java.util.Arrays;

public class Q_0016_3SumClosest {

    /*
     * Given an integer array nums of length n and an integer target, find three integers in nums
     * such that the sum is closest to target.
     * Return the sum of the three integers.
     * You may assume that each input would have exactly one solution.
     *
     */

    public static void main(String[] args) {

    }

    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int aPoint = i + 1;
            int bPoint = nums.length - 1;

            while (aPoint < bPoint) {
                int sum = nums[i] + nums[aPoint] + nums[bPoint];
                if (sum > target) {
                    bPoint--;
                } else {
                    aPoint++;
                }

                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }

        return result;

    }
}
