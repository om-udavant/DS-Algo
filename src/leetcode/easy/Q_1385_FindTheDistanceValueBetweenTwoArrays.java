package leetcode.easy;

public class Q_1385_FindTheDistanceValueBetweenTwoArrays {

    /*
     * Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.
     * The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j]
     * where |arr1[i]-arr2[j]| <= d.
     *
     */

    public static void main(String[] args) {

    }

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int count = 0;
        for (int i : arr1) {
            for (int j : arr2) {
                if (Math.abs(i - j) <= d) {
                    count++;
                    break;
                }
            }
        }

        return (arr1.length - count);

    }

}
