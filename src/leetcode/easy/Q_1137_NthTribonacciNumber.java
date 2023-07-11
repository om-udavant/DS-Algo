package leetcode.easy;

public class Q_1137_NthTribonacciNumber {

    /*
     * The Tribonacci sequence Tn is defined as follows:
     * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
     * Given n, return the value of Tn.
     *
     */

    public static void main(String[] args) {

    }

    public int tribonacci(int n) {

        int t0 = 0;
        int t1 = 1;
        int t2 = 1;

        if (n == 0) {
            return t0;
        } else if (n == 1 || n == 2) {
            return t1;
        }

        int tn = 0;
        for (int i = 3; i <= n; i++) {

            tn = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = tn;

        }

        return tn;

    }
}
