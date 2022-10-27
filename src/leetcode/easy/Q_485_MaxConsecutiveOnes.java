package leetcode.easy;

public class Q_485_MaxConsecutiveOnes {

    /*
     * Given a binary array nums, return the maximum number of consecutive 1's in the array.
     *
     */

    public static void main(String[] args) {

    }

    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int pre = Integer.MIN_VALUE;
        ;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;
            } else {
                pre = Math.max(pre, count);
                count = 0;
            }

        }

        return Math.max(pre, count);

    }
}
