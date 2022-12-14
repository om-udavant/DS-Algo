package leetcode.easy;

public class Q_1480_RunningSumOF1dArray {

    /*
     * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
     * Return the running sum of nums.
     *
     */

    public static void main(String[] args) {

    }

    public int[] runningSum(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;

    }
}
