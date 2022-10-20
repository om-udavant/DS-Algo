package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_228_SummaryRanges {

    /*
     *
     * You are given a sorted unique integer array nums.
     * A range [a,b] is the set of all integers from a to b (inclusive).
     * Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
     * That is, each element of nums is covered by exactly one of the ranges,
     * and there is no integer x such that x is in one of the ranges but not in nums.
     * Each range [a,b] in the list should be output as:
     * "a->b" if a != b
     * "a" if a == b
     *
     * */

    public static void main(String[] args) {

    }

    public List<String> summaryRanges(int[] nums) {

        List<String> list = new ArrayList<>();

        if (nums.length < 1) {
            return list;
        }

        int n = nums.length;
        int start = nums[0];
        int previous = start - 1;
        for (int num : nums) {

            if (num - previous != 1) {
                StringBuilder range = new StringBuilder();
                range.append(start);
                if (start != previous) {
                    range.append("->").append(previous);
                }
                list.add(range.toString());
                start = num;
            }
            previous = num;

        }

        StringBuilder range = new StringBuilder();
        range.append(start);
        if (start != previous) {
            range.append("->").append(previous);
        }
        list.add(range.toString());

        return list;

    }
}
