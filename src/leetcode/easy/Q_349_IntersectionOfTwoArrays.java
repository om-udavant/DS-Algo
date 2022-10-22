package leetcode.easy;

import java.util.HashSet;

public class Q_349_IntersectionOfTwoArrays {

    /*
     * Given two integer arrays nums1 and nums2, return an array of their intersection.
     * Each element in the result must be unique and you may return the result in any order.
     * */

    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<Integer>();
        for (Integer n : nums1) {
            set1.add(n);
        }

        HashSet<Integer> set2 = new HashSet<Integer>();
        for (Integer n : nums2) {
            if (set1.contains(n)) {
                set2.add(n);
            }

        }

        int[] ans = new int[set2.size()];
        int i = 0;
        for (Integer n : set2) {
            ans[i] = n;
            i++;
        }

        return ans;

    }
}
