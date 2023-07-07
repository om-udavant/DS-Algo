package leetcode.easy;

public class Q_1009_ComplementOfBase10Integer {

    /*
     * The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.
     *   - For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
     * Given an integer n, return its complement.
     *
     */

    public static void main(String[] args) {

    }

    public int bitwiseComplement(int n) {

        String bin = Integer.toBinaryString(n);
        String res = "";

        for (char c : bin.toCharArray()) {
            if (c == '1') {
                res += "0";
            } else {
                res += "1";
            }
        }

        return Integer.parseInt(res, 2);

    }
}
