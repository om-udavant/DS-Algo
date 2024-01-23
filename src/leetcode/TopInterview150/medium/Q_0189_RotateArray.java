package leetcode.TopInterview150.medium;

public class Q_0189_RotateArray {

    /*
     * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
     *
     */

    public static void main(String[] args) {

    }

    public void rotate(int[] nums, int k) {

        k = k % nums.length;
        int n = nums.length;

        reverseNums(nums, 0, n - 1);
        reverseNums(nums, 0, k - 1);
        reverseNums(nums, k, n - 1);

    }

    public void reverseNums(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
