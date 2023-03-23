package leetcode.easy;

import java.util.HashSet;

public class Q_961_NRepeatedElementInSize2NArray {

    /*
     * You are given an integer array nums with the following properties:
     *   - nums.length == 2 * n.
     *   - nums contains n + 1 unique elements.
     *   - Exactly one element of nums is repeated n times.
     * Return the element that is repeated n times.
     *
     */

    public static void main(String[] args) {

    }

    public int repeatedNTimes(int[] nums) {

        HashSet set = new HashSet();

        for (int i : nums) {
            if (set.contains(i)) {
                return i;
            }
            set.add(i);
        }

        return 0;

    }
}
