package leetcode.easy;

public class Q_746_MinCostClimbingStaris {

    /*
     * You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
     * Once you pay the cost, you can either climb one or two steps.
     * You can either start from the step with index 0, or the step with index 1.
     * Return the minimum cost to reach the top of the floor.
     *
     */

    public static void main(String[] args) {

    }

    public int minCostClimbingStairs(int[] cost) {

        int step1 = 0;
        int step2 = 0;

        for (int i = cost.length - 1; i >= 0; i--) {

            int current = cost[i] + Math.min(step1, step2);
            step1 = step2;
            step2 = current;

        }

        return Math.min(step1, step2);

        /*
        for(int i = 2; i < cost.length; i++){
            cost[i] += Math.min(cost[i-1], cost[i-2]);
        }

        return Math.min(cost[cost.length-1], cost[cost.length-2]);
        */
    }
}
