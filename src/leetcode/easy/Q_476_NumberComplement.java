package leetcode.easy;

public class Q_476_NumberComplement {

    /*
     * The complement of an integer is the integer you get when you flip all the 0's to 1's and all
     * the 1's to 0's in its binary representation.
     * For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
     * Given an integer num, return its complement.
     *
     */

    public static void main(String[] args) {

    }

    public int findComplement(int num) {

        int result = 0;
        int set = 1;

        while (num != 0) {

            if ((num & 1) == 0) {
                result = result | set;
            }

            num = num >> 1;
            set = set << 1;

        }

        return result;

    }
}
