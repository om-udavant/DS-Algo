package leetcode.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Q_506_RelativeRanks {

    /*
     * You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition.
     * All the scores are guaranteed to be unique.
     * The athletes are placed based on their scores, where the 1st place athlete has the highest score,
     * the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:
     *   -The 1st place athlete's rank is "Gold Medal".
     *   -The 2nd place athlete's rank is "Silver Medal".
     *   -The 3rd place athlete's rank is "Bronze Medal".
     *   -For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
     * Return an array answer of size n where answer[i] is the rank of the ith athlete.
     *
     */

    public static void main(String[] args) {

    }

    public String[] findRelativeRanks(int[] score) {

        Integer[] temp = new Integer[score.length];
        int ind = 0;
        for (int i : score) {
            temp[ind++] = i;
        }
        Arrays.sort(temp, Collections.reverseOrder());

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int i : temp) {
            map.put(i, rank);
            rank++;
        }

        String[] s = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            int medal = map.get(score[i]);
            if (medal == 1) {
                s[i] = "Gold Medal";
            } else if (medal == 2) {
                s[i] = "Silver Medal";
            } else if (medal == 3) {
                s[i] = "Bronze Medal";
            } else {
                s[i] = "" + medal;
            }
        }

        return s;

        /*
        String[] res = new String[score.length];


        int maxNum = 0;
        for (int i = 0; i < score.length; i++) {
            maxNum = Math.max(maxNum, score[i]);
        }


        int[] index = new int[maxNum + 1];
        for (int i = 0; i < score.length; i++) {
            index[score[i]] = i + 1;
        }

        res[index[maxNum] - 1] = "Gold Medal";

        int count = 1;
        for (int i = maxNum-1; i >= 0; i--) {
            int in = index[i];
            if (in != 0) {
                count++;
                if (count == 2) {
                    res[in-1] = "Silver Medal";
                } else if (count == 3) {
                    res[in-1] = "Bronze Medal";
                } else {
                    res[in-1] = count + "";
                }
            }
        }
        return res;
        */

    }
}
