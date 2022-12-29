package leetcode.medium;

public class Q_0189_RotateArray {

    /*
     * Given an array, rotate the array to the right by k steps, where k is non-negative.
     *
     */

    public static void main(String[] args) {

    }

    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);

    }

    public void reverse(int[] nums, int i, int j) {
        int tmp = 0;
        while (i < j) {
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }
}
