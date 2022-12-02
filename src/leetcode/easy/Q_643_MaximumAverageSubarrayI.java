package leetcode.easy;

public class Q_643_MaximumAverageSubarrayI {

    /*
     * You are given an integer array nums consisting of n elements, and an integer k.
     * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
     * Any answer with a calculation error less than 10-5 will be accepted.
     *
     */

    public static void main(String[] args) {

    }

    public double findMaxAverage(int[] nums, int k) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        double max = nums[k - 1];
        for (int i = k; i < nums.length; i++) {
            double temp = nums[i] - nums[i - k];
            max = Math.max(temp, max);
        }

        return max / k;

    }
}
