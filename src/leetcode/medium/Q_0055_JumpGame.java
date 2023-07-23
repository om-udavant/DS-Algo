package leetcode.medium;

public class Q_0055_JumpGame {

    /*
     * You are given an integer array nums. You are initially positioned at the array's first index,
     * and each element in the array represents your maximum jump length at that position.
     * Return true if you can reach the last index, or false otherwise.
     *
     */

    public static void main(String[] args) {

    }

    public boolean canJump(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return true;
        }

        int max = 0;

        for (int i = 0; i < n - 1 && max >= i; i++) {
            if (max < i + nums[i]) {
                max = i + nums[i];
            }

            if (max >= n - 1) {
                return true;
            }
        }

        return false;
    }

}
