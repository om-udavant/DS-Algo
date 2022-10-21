package leetcode.easy;

public class Q_258_AddDigits {

    /*
     *
     * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
     *
     * */

    public static void main(String[] args) {

    }

    public int addDigits(int num) {

        while (num >= 10) {
            int sum = 0;

            while (num != 0) {

                int s = num % 10;
                sum += s;
                num = num / 10;

            }

            num = sum;

        }

        return num;

    }
}
