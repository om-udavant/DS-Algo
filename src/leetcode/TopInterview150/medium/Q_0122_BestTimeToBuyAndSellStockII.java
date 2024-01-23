package leetcode.TopInterview150.medium;

public class Q_0122_BestTimeToBuyAndSellStockII {

    /*
     * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
     * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
     * However, you can buy it then immediately sell it on the same day.
     * Find and return the maximum profit you can achieve.
     *
     */

    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {

        int maxPr = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            int first = prices[i];
            int second = prices[i + 1];

            if (first < second) {
                maxPr += second - first;
            }

        }

        return maxPr;

    }
}
