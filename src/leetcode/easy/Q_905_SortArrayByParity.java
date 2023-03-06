package leetcode.easy;

public class Q_905_SortArrayByParity {

    /*
     * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
     * Return any array that satisfies this condition.
     *
     */

    public static void main(String[] args) {

    }

    public int[] sortArrayByParity(int[] nums) {

        for (int i = 0, j = 0; j < nums.length; j++)
            if (nums[j] % 2 == 0) {
                int tmp = nums[i];
                nums[i++] = nums[j];
                nums[j] = tmp;
                ;
            }
        return nums;

    }
}
