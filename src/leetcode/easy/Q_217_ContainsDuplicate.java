package leetcode.easy;

import java.util.HashSet;

public class Q_217_ContainsDuplicate {

    /*
     *
     * Given an integer array nums, return true if any value appears at least twice in the array,
     * and return false if every element is distinct.
     *
     * */

    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        set.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {

            int j = nums[i];

            if (set.contains(j)) {
                return true;
            } else {
                set.add(j);
            }
        }

        return false;

    }

}
