package hackerrank.easy;

import java.util.ArrayList;

public class Q_047_ModifiedKaprekarNumbers {

    /*
     * Complete the 'kaprekarNumbers' function below.
     *
     * int p: the lower limit
     * int q: the upper limit
     *
     * Prints
     * It should print the list of modified Kaprekar numbers, space-separated on
     * one line and in ascending order. If no modified Kaprekar numbers exist in the
     * given range, print INVALID RANGE. No return value is required.
     *
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER q
     */

    public static void main(String[] args) {

        int p = 1;
        int q = 99999;

        kaprekarNumbers(p, q);
    }

    private static void kaprekarNumbers(int p, int q) {

        ArrayList<Long> ans = new ArrayList<>();

        for (long i = p; i <= q; i++) {
            long sq = i * i;
            String num = String.valueOf(i);
            String s = String.valueOf(sq);

            int leftLength = s.length() - num.length();
            long leftNum = 0;
            if (leftLength == 0) {
                leftNum = 0;
            } else {
                leftNum = Long.parseLong(s.substring(0, leftLength));
            }

            long rightNum = Long.parseLong(s.substring(leftLength));
            long sum = leftNum + rightNum;
            if (sum == i) {
                ans.add(i);
            }
        }

        if (ans.size() == 0) {
            System.out.print("INVALID RANGE");
        } else {
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i) + " ");
            }
        }
    }
}
