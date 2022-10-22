package leetcode.easy;

public class Q_303_RangeSumQueryImmutable {

    /*
     * Given an integer array nums, handle multiple queries of the following type:
     *   -Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
     * Implement the NumArray class:
     *   -NumArray(int[] nums) Initializes the object with the integer array nums.
     *   -int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
     *
     * */

    public static void main(String[] args) {

    }

    int[] nums;

    public void NumArray(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        this.nums = nums;

    }

    public int sumRange(int left, int right) {

        if (left == 0) {
            return nums[right];
        }

        return nums[right] - nums[left - 1];

    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */

