package leetcode.easy;

public class Q_263_UglyNumber {

    /*
     * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
     * Given an integer n, return true if n is an ugly number.
     * */

    public static void main(String[] args) {

    }

    public boolean isUgly(int n) {

        if (n == 1) {
            return true;
        }

        while (n > 0 && (n % 2 == 0 || n % 3 == 0 || n % 5 == 0)) {
            if (n % 2 == 0) {
                n = n / 2;
            }
            if (n % 3 == 0) {
                n = n / 3;
            }
            if (n % 5 == 0) {
                n = n / 5;
            }
        }

        if (n == 1) {
            return true;
        }

        return false;

    }
}
