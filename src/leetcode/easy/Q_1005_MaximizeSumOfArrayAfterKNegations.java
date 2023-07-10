package leetcode.easy;

import java.util.Arrays;

public class Q_1005_MaximizeSumOfArrayAfterKNegations {

    /*
     * Given an integer array nums and an integer k, modify the array in the following way:
     *   - choose an index i and replace nums[i] with -nums[i].
     * You should apply this process exactly k times. You may choose the same index i multiple times.
     * Return the largest possible sum of the array after modifying it in this way.
     *
     */

    public static void main(String[] args) {

    }

    public int largestSumAfterKNegations(int[] nums, int k) {

        for(int i = 0; i < k; i++){
            Arrays.sort(nums);
            nums[0] = -1 * nums[0];
        }

        int ans = 0;
        for(int i : nums){
            ans += i;
        }

        return ans;

    }
}
