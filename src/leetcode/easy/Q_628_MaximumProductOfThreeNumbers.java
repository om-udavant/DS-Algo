package leetcode.easy;

import java.util.Arrays;

public class Q_628_MaximumProductOfThreeNumbers {

    /*
     * Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
     *
     */

    public static void main(String[] args) {

    }

    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        int size = nums.length - 1;
        return Math.max(nums[size] * nums[size - 1] * nums[size - 2], nums[0] * nums[1] * nums[size]);

    }
}
