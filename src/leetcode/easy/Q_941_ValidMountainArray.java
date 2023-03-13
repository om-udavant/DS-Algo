package leetcode.easy;

public class Q_941_ValidMountainArray {

    /*
     * Given an array of integers arr, return true if and only if it is a valid mountain array.
     * Recall that arr is a mountain array if and only if:
     *   - arr.length >= 3
     * There exists some i with 0 < i < arr.length - 1 such that:
     *   - arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
     *   - arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
     *
     */

    public static void main(String[] args) {

    }

    public boolean validMountainArray(int[] arr) {

        if (arr.length >= 3) {
            int i = 0;
            int inc = 0;
            int dec = 0;
            while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
                inc++;
                i++;
                if (inc == arr.length - 1) {
                    return false;
                }
            }
            while (i < arr.length - 1 && arr[i] > arr[i + 1]) {
                dec++;
                i++;
                if (dec == arr.length - 1) {
                    return false;
                }
            }
            if (inc + dec == arr.length - 1) {
                return true;
            }
        }
        return false;

    }
}
