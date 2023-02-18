package leetcode.easy;

public class Q_896_MonotonicArray {

    /*
     * An array is monotonic if it is either monotone increasing or monotone decreasing.
     * An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j].
     * An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
     * Given an integer array nums, return true if the given array is monotonic, or false otherwise.
     *
     */

    public static void main(String[] args) {

    }

    public boolean isMonotonic(int[] nums) {

        boolean increase = true;
        boolean decrease = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                increase = false;
            } else if (nums[i] > nums[i + 1]) {
                decrease = false;
            }
        }

        return increase || decrease;

    }
}
