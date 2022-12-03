package leetcode.easy;

import java.util.HashSet;

public class Q_645_SetMismatch {

    /*
     * You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately,
     * due to some error, one of the numbers in s got duplicated to another number in the set,
     * which results in repetition of one number and loss of another number.
     * You are given an integer array nums representing the data status of this set after the error.
     * Find the number that occurs twice and the number that is missing and return them in the form of an array.
     *
     */

    public static void main(String[] args) {

    }

    public int[] findErrorNums(int[] nums) {

        int[] arr = new int[2];

        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (set.contains(i)) {
                arr[0] = i;
            }
            set.add(i);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                arr[1] = i;
            }
        }

        return arr;

    }
}
