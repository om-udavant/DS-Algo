package leetcode.easy;

public class Q_136_SingleNumber {

    /*
     *
     * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
     * You must implement a solution with a linear runtime complexity and use only constant extra space.
     *
     * */

    public int singleNumber(int[] nums) {


        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }

        return res;

    }
}
