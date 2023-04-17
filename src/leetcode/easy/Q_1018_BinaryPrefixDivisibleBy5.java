package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_1018_BinaryPrefixDivisibleBy5 {

    /*
     * You are given a binary array nums (0-indexed).
     * We define xi as the number whose binary representation is the subarray nums[0..i]
     * (from most-significant-bit to least-significant-bit).
     * For example, if nums = [1,0,1], then x0 = 1, x1 = 2, and x2 = 5.
     * Return an array of booleans answer where answer[i] is true if xi is divisible by 5.
     *
     */

    public static void main(String[] args) {

    }

    public List<Boolean> prefixesDivBy5(int[] nums) {
        int k = 0;
        List<Boolean> ans = new ArrayList<>();
        for (int a : nums) {
            k = (k << 1 | a) % 5;
            ans.add(k == 0);
        }
        return ans;
    }
}
