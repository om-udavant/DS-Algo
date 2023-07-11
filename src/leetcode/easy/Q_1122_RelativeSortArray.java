package leetcode.easy;

public class Q_1122_RelativeSortArray {

    /*
     * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
     * Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.
     * Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
     *
     */

    public static void main(String[] args) {

    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] arr = new int[1001];

        for (int num : arr1)
            arr[num]++;

        int[] res = new int[arr1.length];

        int i = 0;

        for (int num : arr2) {
            while (arr[num] > 0) {
                res[i] = num;
                arr[num]--;
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            while (arr[j] > 0) {
                res[i] = j;
                arr[j]--;
                i++;
            }
        }

        return res;

    }
}
