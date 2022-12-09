package leetcode.easy;

public class Q_693_BinaryNumberWithAlternatingBits {

    /*
     * Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.
     *
     */

    public static void main(String[] args) {

    }

    public boolean hasAlternatingBits(int n) {

        String bit = Integer.toBinaryString(n);

        for (int i = 0; i < bit.length() - 1; i++) {
            if (bit.charAt(i) == bit.charAt(i + 1)) {
                return false;
            }
        }

        return true;

    }

}
