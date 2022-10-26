package leetcode.easy;

public class Q_461_HammingDistance {

    /*
     *
     *The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
     * Given two integers x and y, return the Hamming distance between them.
     *
     */

    public static void main(String[] args) {

    }

    public int hammingDistance(int x, int y) {

        int d = 0;
        int bit = (x ^ y);

        while (bit > 0) {

            if (bit % 2 == 1) {
                d++;
            }

            bit = bit >> 1;

        }

        return d;

    }
}
