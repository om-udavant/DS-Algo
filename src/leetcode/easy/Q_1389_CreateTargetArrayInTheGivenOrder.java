package leetcode.easy;

import java.util.ArrayList;

public class Q_1389_CreateTargetArrayInTheGivenOrder {

    /*
     * Given two arrays of integers nums and index. Your task is to create target array under the following rules:
     *   - Initially target array is empty.
     *   - From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
     *   - Repeat the previous step until there are no elements to read in nums and index.
     * Return the target array.
     * It is guaranteed that the insertion operations will be valid.
     *
     */

    public static void main(String[] args) {

    }

    public int[] createTargetArray(int[] nums, int[] index) {

        int[] target = new int[nums.length];
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            ans.add(index[i], nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            target[i] = ans.get(i);
        }
        return target;

    }
}
