package leetcode.TopInterview150.easy;

public class Q_0121_BestTimeToBuyAndSellStock {

    /*
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     *
     */

    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i : prices){
            min = Math.min(min, i);
            max = Math.max(max, i-min);

        }
        return max;
        /*
        int maxPr = 0;
        int pr = 0;
        int no = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < no){
                no = prices[i];
            }

            pr = prices[i] - no;

            if(maxPr < pr){
                maxPr = pr;
            }
        }

        return maxPr;

        */


    }
}
