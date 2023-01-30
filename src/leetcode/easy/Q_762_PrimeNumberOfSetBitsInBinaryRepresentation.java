package leetcode.easy;

public class Q_762_PrimeNumberOfSetBitsInBinaryRepresentation {

    /*
     *
     * Given two integers left and right, return the count of numbers in the inclusive range [left, right]
     * having a prime number of set bits in their binary representation.
     * Recall that the number of set bits an integer has is the number of 1's present when written in binary.
     *   -For example, 21 written in binary is 10101, which has 3 set bits.
     *
     */

    public static void main(String[] args) {

    }

    public int countPrimeSetBits(int left, int right) {

        int count = 0;

        while (left <= right) {

            int bit = Integer.bitCount(left);

            if (isPrime(bit)) {
                count++;
            }
            left++;
        }

        return count;

    }

    public boolean isPrime(int no) {

        if (no <= 1) {
            return false;
        }

        for (int i = 2; i <= no / 2; i++) {
            if (no % i == 0) {
                return false;
            }
        }

        return true;
    }
}
