package leetcode.easy;

import java.util.Arrays;

public class Q_1356_SortIntegersByTheNumberOf1Bits {

    /*
     * You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in
     * their binary representation and in case of two or more integers have the same number of 1's you have to sort them
     * in ascending order.
     * Return the array after sorting it.
     *
     */

    public static void main(String[] args) {

    }

    public int[] sortByBits(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] += Integer.bitCount(arr[i]) * 10001;
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10001;
        }

        return arr;
    }
}
