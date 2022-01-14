package geeksforgeeks.arrays.optimization;

public class Q_002_StockBuyAndSell {

    public static void main(String[] args){
        int[] arr = {2, 30, 15, 10, 8, 25, 80};

        System.out.println("Maximum Profit is " + maxProfit(arr));
    }

    private static int maxProfit(int[] arr) {

        int n = arr.length, profit = 0;

        for(int i = 1; i < n; i++){
            if(arr[i] > arr[i - 1]){
                profit += (arr[i] - arr[i - 1]);
            }
        }
        return profit;
    }
}
