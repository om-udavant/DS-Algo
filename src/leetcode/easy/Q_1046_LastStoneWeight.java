package leetcode.easy;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q_1046_LastStoneWeight {

    /*
     * You are given an array of integers stones where stones[i] is the weight of the ith stone.
     * We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together.
     * Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
     *  -If x == y, both stones are destroyed, and
     *  -If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
     * At the end of the game, there is at most one stone left.
     * Return the weight of the last remaining stone. If there are no stones left, return 0.
     *
     */

    public static void main(String[] args) {

    }

    public int lastStoneWeight(int[] stones) {
        if (stones.length < 2) return stones[0];
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        for (int x : stones) {
            que.add(x);
        }
        while (!que.isEmpty()) {
            if (que.size() == 1) {
                return que.poll();
            }
            int k = que.poll();
            int j = que.poll();
            if (k == j) {
                que.add(0);
            } else {
                que.add(k - j);
            }
        }
        return 0;

    }
}
