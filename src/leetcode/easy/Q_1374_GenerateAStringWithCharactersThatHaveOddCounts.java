package leetcode.easy;

public class Q_1374_GenerateAStringWithCharactersThatHaveOddCounts {

    /*
     * Given an integer n, return a string with n characters such that each character in such string occurs an odd number of times.
     * The returned string must contain only lowercase English letters. If there are multiples valid strings, return any of them.
     *
     */

    public static void main(String[] args) {

    }

    public String generateTheString(int n) {

        StringBuffer sb = new StringBuffer();
        if (n % 2 == 0) {
            sb.append('a');
            for (int i = 1; i < n; i++) {
                sb.append('b');
            }
        } else {
            for (int i = 0; i < n; i++) {
                sb.append('a');
            }
        }

        return sb.toString();

    }
}
