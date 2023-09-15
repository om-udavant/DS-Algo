package leetcode.easy;

public class Q_1323_Maximum69Number {

    /*
     * You are given a positive integer num consisting only of digits 6 and 9.
     * Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
     *
     */

    public static void main(String[] args) {

    }

    public int maximum69Number(int num) {

        char[] s = String.valueOf(num).toCharArray();

        for (int i = 0; i < s.length; i++) {
            if (s[i] == '6') {
                s[i] = '9';
                break;
            }
        }

        return Integer.parseInt(new String(s));

    }
}
