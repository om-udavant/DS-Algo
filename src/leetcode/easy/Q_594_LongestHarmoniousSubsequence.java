package leetcode.easy;

import java.util.HashMap;

public class Q_594_LongestHarmoniousSubsequence {

    /*
     * We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
     * Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.
     * A subsequence of array is a sequence that can be derived from the array by deleting some or no elements
     * without changing the order of the remaining elements.
     *
     */

    public static void main(String[] args) {

    }

    public int findLHS(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                res = Math.max(res, map.get(key) + map.get(key + 1));
            }
        }

        return res;

        /*
        int res = 0;

        for(int i = 1; i < nums.length; i++){
            int count = 0;
            boolean flag = false;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] == nums[i]){
                    count++;
                }else if(nums[j] + 1 == nums[i]){
                    count++;
                    flag = true;
                }
            }

            if(flag){
                res = Math.max(count, res);
            }
        }

        return res;
        */
    }
}
