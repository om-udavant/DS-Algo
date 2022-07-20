package hackerrank;

public class Q_024_ElectronicsShop {

    /*
     * Complete the getMoneySpent function below.
     *
     * A person wants to determine the most expensive computer keyboard and
     * USB drive that can be purchased with a give budget. Given price lists for
     * keyboards and USB drives and a budget, find the cost to buy them.
     * If it is not possible to buy both items, return -1.
     *
     */

    public static void main(String[] args) {

        int[] keyboards = {40, 50, 60};
        int[] drives = {5, 8, 12};
        int b = 60;

        int result = getMoneySpent(keyboards, drives, b);

        System.out.println(result);
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int total = 0;

        for (int i = 0; i < keyboards.length; i++) {

            for (int j = 0; j < drives.length; j++) {
                int sum = keyboards[i] + drives[j];
                if (sum <= b) {
                    total = Math.max(sum, total);
                }
            }
        }
        if (total == 0) {
            return -1;
        }
        return total;

    }
}
