package leetcode.medium;

import java.util.HashSet;

public class Q_0128_LongestConsecutiveSequence {

    /*
     * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
     * You must write an algorithm that runs in O(n) time.
     *
     */

    public static void main(String[] args) {

    }

    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int currentLength = 1;

            if (!set.contains(currentNum - 1)) {
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentLength += 1;
                }

                maxCount = Math.max(maxCount, currentLength);
            }
        }

        return maxCount;

    }

}
