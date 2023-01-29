package leetcode.easy;

public class Q_747_LargestNumberAtLeastTwiceOfOthers {

    /*
     * You are given an integer array nums where the largest integer is unique.
     * Determine whether the largest element in the array is at least twice as much as every other number in the array.
     * If it is, return the index of the largest element, or return -1 otherwise.
     *
     */

    public static void main(String[] args) {

    }

    public int dominantIndex(int[] nums) {

        int first = -1;
        int second = -1;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > first) {
                second = first;
                first = nums[i];
                index = i;
            } else if (nums[i] > second) {
                second = nums[i];
            }
        }

        if (first >= second * 2) {
            return index;
        } else {
            return -1;
        }

    }
}
