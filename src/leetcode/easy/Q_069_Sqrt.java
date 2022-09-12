package leetcode.easy;

public class Q_069_Sqrt {

    /*
     *
     * Given a non-negative integer x, compute and return the square root of x.
     * Since the return type is an integer, the decimal digits are truncated,
     * and only the integer part of the result is returned.
     * Note: You are not allowed to use any built-in exponent function or operator,
     * such as pow(x, 0.5) or x ** 0.5.
     *
     * */

    public static void main(String[] args) {

    }

    public int mySqrt(int x) {

        int low = 1;
        int high = x / 2;

        if (x == 0 || x == 1) {
            return x;
        }

        while (low <= high) {
            long mid = low + (high - low) / 2;
            //int sum = (int)(mid * mid);

            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid > x) {
                high = (int) mid - 1;
            } else {
                low = (int) mid + 1;
            }
        }

        return high;
    }
}
