package leetcode.easy;

public class Q_1413_MinimumValueToGetPositiveStepByStepSum {

    /*
     * Given an array of integers nums, you start with an initial positive value startValue.
     * In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).
     * Return the minimum positive value of startValue such that the step by step sum is never less than 1.
     *
     */

    public static void main(String[] args) {

    }

    public int minStartValue(int[] nums) {
        int min = 0;
        int sum = 0;
        for (int a : nums) {
            sum += a;
            if (sum < min) min = sum;
        }
        if (min < 0) {
            return 1 + (-(min));
        }
        return 1;
    }

}
