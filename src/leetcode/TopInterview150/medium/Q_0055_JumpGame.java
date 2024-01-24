package leetcode.TopInterview150.medium;

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

        int jump = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (jump < nums[i]) {
                jump = nums[i];
            }

            if (jump == 0) {
                return false;
            }

            jump--;
        }

        return true;

    }
}
