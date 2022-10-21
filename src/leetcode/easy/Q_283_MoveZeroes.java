package leetcode.easy;

public class Q_283_MoveZeroes {

    /*
     *
     * Given an integer array nums, move all 0's to the end of it while maintaining
     * the relative order of the non-zero elements.
     * Note that you must do this in-place without making a copy of the array.
     *
     * */

    public static void main(String[] args) {

    }

    public void moveZeroes(int[] nums) {

        int count = 0;
        int size = nums.length;

        for (int i = 0; i < size; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }

        while (count < size) {
            nums[count] = 0;
            count++;
        }

    }
}
