package leetcode.easy;

public class Q_414_ThirdMaximumNumber {

    /*
     *
     * Given an integer array nums, return the third distinct maximum number in this array.
     * If the third maximum does not exist, return the maximum number.
     * */

    public static void main(String[] args) {

    }

    public int thirdMax(int[] nums) {

        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;

        for (Integer i : nums) {

            if (i.equals(max1) || i.equals(max2) || i.equals(max3)) {
                continue;
            }

            if (max1 == null || max1 < i) {
                max3 = max2;
                max2 = max1;
                max1 = i;

            } else if (max2 == null || max2 < i) {
                max3 = max2;
                max2 = i;

            } else if (max3 == null || max3 < i) {
                max3 = i;
            }
        }

        if (max3 == null) {
            return max1;
        } else {
            return max3;
        }

    }
}
