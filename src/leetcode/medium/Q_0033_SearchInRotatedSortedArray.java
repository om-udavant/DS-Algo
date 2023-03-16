package leetcode.medium;

public class Q_0033_SearchInRotatedSortedArray {

    /*
     * There is an integer array nums sorted in ascending order (with distinct values).
     * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
     * such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
     * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].\
     * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums,
     * or -1 if it is not in nums.
     * You must write an algorithm with O(log n) runtime complexity.
     *
     */

    public static void main(String[] args) {

    }

    public int search(int[] nums, int target) {
        return find(nums, 0, nums.length - 1, target);
    }

    public int find(int[] nums, int left, int right, int target) {
        if ((right - left) == 1 || left == right) {
            if (nums[left] == target) {
                return left;
            } else if (nums[right] == target) {
                return right;
            } else {
                return -1;
            }
        }

        int mid = (left + right) / 2;
        if (nums[left] <= nums[mid]) {
            if (target >= nums[left] && target <= nums[mid]) {
                return find(nums, left, mid, target);
            } else {
                return find(nums, mid, right, target);
            }
        } else {
            if (target >= nums[left] || target <= nums[mid]) {
                return find(nums, left, mid, target);
            } else {
                return find(nums, mid, right, target);
            }
        }
    }
}
