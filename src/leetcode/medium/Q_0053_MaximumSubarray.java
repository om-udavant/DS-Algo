package leetcode.medium;

public class Q_0053_MaximumSubarray {

    /*
     * Given an integer array nums, find the subarray with the largest sum, and return its sum.
     *
     */

    public static void main(String[] args) {

    }

    public int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(sum, max);

            if (sum < 0) {
                sum = 0;
            }
        }

        return max;

    }
}
