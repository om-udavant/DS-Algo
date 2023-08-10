package leetcode.medium;

public class Q_0050_Pow {

    /*
     * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
     *
     */

    public static void main(String[] args) {

    }

    public double myPow(double x, int n) {

        long N = n;
        double ans = solve(x, Math.abs(N));

        if (N < 0) {
            return 1 / ans;
        }

        return ans;

    }

    public double solve(double x, long n) {
        if (n == 0) {
            return 1;
        }

        double temp = solve(x, n / 2);

        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }
}
