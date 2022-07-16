package hackerrank.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_020_BillDivision {

    /*
     * Complete the 'bonAppetit' function below.
     *
     * bill: an array of integers representing the cost of each item ordered
     * k: an integer representing the zero-based index of the item Anna doesn't eat
     * b: the amount of money that Anna contributed to the bill
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void main(String[] args) {
        List<Integer> bill = new ArrayList<>();

        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);

        int k = 1, b = 12;

        bonAppetit(bill, b, k);

    }

    public static void bonAppetit(List<Integer> bill, int b, int k) {

        int total = 0;
        int ans;

        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                total = total + bill.get(i);
            }
        }

        total = total / 2;

        if (b <= total) {
            System.out.println("Bon Appetit");
        } else {
            ans = b - total;
            System.out.println(ans);
        }

    }
}
