package leetcode.medium;

public class Q_0034_FindFirstAndLastPositionOfElementInSortedArray {

    /*
     * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
     * If target is not found in the array, return [-1, -1].
     * You must write an algorithm with O(log n) runtime complexity.
     *
     */

    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {

        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (j == 0) {
                    arr[0] = i;
                }

                arr[1] = i;
                j++;
            }
        }

        return arr;

    }
}
