package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Q_001_TwoSum {

    /*
     * Given an array of integers nums and an integer target, return indices of the two numbers
     * such that they add up to target.You may assume that each input would have exactly one
     * solution, and you may not use the same element twice.You can return the answer in any order.
     *
     * Example 1:
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     *
     */

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private static int[] twoSum(int[] nums, int target) {

        /* Time Complexity O(n^2)
        for (int i = 0; i < nums.length; i++){
            int sum = 0;
            for (int j = 0; j < nums.length; j++){
                sum = nums[i] + nums[j];
                if(sum == target){
                    int[] arr = {i , j};
                    return arr;
                }
            }
        }
        return null;
        */

        // Time Complexity O(n)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[]{map.get(comp), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
