package leetcode.easy;

import java.util.HashMap;

public class Q_1399_CountLargestGroup {

    /*
     * You are given an integer n.
     * Each number from 1 to n is grouped according to the sum of its digits.
     * Return the number of groups that have the largest size.
     *
     */

    public static void main(String[] args) {

    }

    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num = 1; num <= n; num++) {
            int sum = 0;
            int tmpn = num;

            if (num > 9) {
                while (tmpn > 0) {
                    sum += tmpn % 10;
                    tmpn /= 10;
                }
            } else
                sum = num;

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        int max = 0;
        for (int val : map.values()) {
            max = Math.max(max, val);
        }

        int cnt = 0;
        for (int val : map.values()) {
            if (val == max)
                cnt++;
        }

        return cnt;
    }

}
