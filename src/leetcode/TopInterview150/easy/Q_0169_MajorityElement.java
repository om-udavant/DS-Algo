package leetcode.TopInterview150.easy;

import java.util.HashMap;
import java.util.Map;

public class Q_0169_MajorityElement {

    /*
     * Given an array nums of size n, return the majority element.
     * The majority element is the element that appears more than ⌊n / 2⌋ times.
     * You may assume that the majority element always exists in the array.
     *
     */

    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {

        Integer ans = null;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {

            if (map.containsKey(i)) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            } else {
                map.put(i, 1);
            }

            if (ans == null || map.get(ans) < map.get(i)) {
                ans = i;
            }

        }

        return ans;

    }

}
