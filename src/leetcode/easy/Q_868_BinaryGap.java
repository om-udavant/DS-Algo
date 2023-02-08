package leetcode.easy;

public class Q_868_BinaryGap {

    /*
     * Given a positive integer n, find and return the longest distance between any two adjacent 1's in the binary representation of n.
     * If there are no two adjacent 1's, return 0.
     * Two 1's are adjacent if there are only 0's separating them (possibly no 0's).
     * The distance between two 1's is the absolute difference between their bit positions.
     * For example, the two 1's in "1001" have a distance of 3.
     *
     */

    public static void main(String[] args) {

    }

    public int binaryGap(int n) {

        String bin = Integer.toBinaryString(n);
        int max = 0;
        int prev = 0;

        for (int i = 1; i < bin.length(); i++) {

            if (bin.charAt(i) == '1') {
                max = Math.max(max, i - prev);
                prev = i;
            }
        }

        return max;

    }

}
