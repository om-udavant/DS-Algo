package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_922_SortArrayByParityII {

    /*
     * Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
     * Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
     * Return any answer array that satisfies this condition.
     *
     */

    public static void main(String[] args) {

    }

    public int[] sortArrayByParityII(int[] nums) {

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int i : nums) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }

        for (int i = 0; i < nums.length; i++) {

            if (i % 2 == 0) {
                nums[i] = even.remove(0);
            } else {
                nums[i] = odd.remove(0);
            }

        }

        return nums;

    }
}
