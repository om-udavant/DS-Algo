package leetcode.easy;

public class Q_342_PowerOfFour {

    /*
     *
     * Given an integer n, return true if it is a power of four. Otherwise, return false.
     * An integer n is a power of four, if there exists an integer x such that n == 4x.
     * */

    public static void main(String[] args) {

    }

    public boolean isPowerOfFour(int n) {

        if (n <= 0) {
            return false;
        }

        while (n % 4 == 0) {
            n = n / 4;
        }

        return (n == 1);

    }

}
