package leetcode.medium;

public class Q_0007_ReverseInteger {

    /*
     *
     * Given a signed 32-bit integer x, return x with its digits reversed.
     * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
     * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
     *
     */

    public int reverse(int x) {

        int rem;
        long reverse = 0;

        while (x != 0) {

            rem = x % 10;
            reverse = (reverse * 10) + rem;
            x = x / 10;

        }

        if (reverse >= Integer.MIN_VALUE && reverse <= Integer.MAX_VALUE) {
            return (int) reverse;
        } else {
            return 0;
        }

    }

}
