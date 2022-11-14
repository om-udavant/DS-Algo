package leetcode.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Q_0015_3Sum {

    /*
     * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k,
     * and j != k, and nums[i] + nums[j] + nums[k] == 0.
     * Notice that the solution set must not contain duplicate triplets.
     *
     */

    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> ans = new LinkedList();

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int low = i + 1;
                int high = nums.length - 1;
                int sum = 0 - nums[i];

                while (low < high) {
                    if (nums[low] + nums[high] == sum) {
                        ans.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low + 1]) {
                            low++;
                        }
                        while (low < high && nums[high] == nums[high - 1]) {
                            high--;
                        }
                        low++;
                        high--;
                    } else if (nums[low] + nums[high] > sum) {
                        high--;
                    } else {
                        low++;
                    }
                }
            }

        }

        return ans;

    }
}
