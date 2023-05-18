package leetcode.easy;

import java.util.Arrays;

public class Q_1013_PartitionArrayIntoThreePartsWithEqualSum {

    /*
     *
     * Given an array of integers arr, return true if we can partition the array into three non-empty parts with equal sums.
     * Formally, we can partition the array if we can find indexes i + 1 < j with
     * (arr[0] + arr[1] + ... + arr[i] == arr[i + 1] + arr[i + 2] + ... + arr[j - 1] == arr[j] + arr[j + 1] + ... + arr[arr.length - 1])
     *
     */

    public static void main(String[] args) {

    }

    public boolean canThreePartsEqualSum(int[] arr) {

        /*
        int sum = 0;
        for(int i : arr){
            sum += i;
        }*/

        int sum = Arrays.stream(arr).sum();

        if (sum % 3 != 0) {
            return false;
        }

        int average = sum / 3;
        int total = 0;
        int count = 0;

        for (int i : arr) {
            total += i;
            if (total == average) {
                count++;
                total = 0;
            }
        }

        return count >= 3;

    }
}
