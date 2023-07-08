package leetcode.easy;

import java.util.ArrayList;

public class Q_1089_DuplicateZeros {

    /*
     * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
     * Note that elements beyond the length of the original array are not written.
     * Do the above modifications to the input array in place and do not return anything.
     *
     */

    public static void main(String[] args) {

    }

    public void duplicateZeros(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                ans.add(arr[i]);
            } else {
                ans.add(0);
                ans.add(0);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans.get(i);
        }

    }
}
