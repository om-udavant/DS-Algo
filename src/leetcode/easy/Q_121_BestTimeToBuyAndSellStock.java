package leetcode.easy;

public class Q_121_BestTimeToBuyAndSellStock {

    /*
     *
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * You want to maximize your profit by choosing a single day to buy one stock
     * and choosing a different day in the future to sell that stock.
     * Return the maximum profit you can achieve from this transaction.
     * If you cannot achieve any profit, return 0.
     *
     * */

    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {

        int minSell = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (minSell > prices[i]) {
                minSell = prices[i];
            } else if ((prices[i] - minSell) > maxProfit) {
                maxProfit = prices[i] - minSell;
            }

        }

        return maxProfit;

    }

}
