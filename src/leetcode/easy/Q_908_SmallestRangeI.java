package leetcode.easy;

public class Q_908_SmallestRangeI {

    /*
     * You are given an integer array nums and an integer k.
     * In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x
     * where x is an integer from the range [-k, k]. You can apply this operation at most once for each index i.
     * The score of nums is the difference between the maximum and minimum elements in nums.
     * Return the minimum score of nums after applying the mentioned operation at most once for each index in it.
     *
     */

    public static void main(String[] args) {

    }

    public int smallestRangeI(int[] nums, int k) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        int ans = (max - k) - (min + k);
        return Math.max(0, ans);
    }
}
