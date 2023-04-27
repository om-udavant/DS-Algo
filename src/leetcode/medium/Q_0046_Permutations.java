package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Q_0046_Permutations {

    /*
     * Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
     *
     */

    public static void main(String[] args) {

    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        permuteHelper(nums, 0, result);
        return result;

    }

    private void permuteHelper(int[] nums, int start, List<List<Integer>> result) {
        if (start == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            result.add(permutation);
        } else {
            for (int i = start; i < nums.length; i++) {
                swap(nums, start, i);
                permuteHelper(nums, start + 1, result);
                swap(nums, start, i);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
