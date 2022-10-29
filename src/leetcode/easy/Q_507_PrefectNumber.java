package leetcode.easy;

public class Q_507_PrefectNumber {

    /*
     * A perfect number is a positive integer that is equal to the sum of its positive divisors,
     * excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.
     * Given an integer n, return true if n is a perfect number, otherwise return false.
     *
     */

    public static void main(String[] args) {

    }

    public boolean checkPerfectNumber(int num) {

        if (num <= 1) {
            return false;
        }
        int sum = 1;
        int maxNum = num;
        for (int i = 2; i < maxNum; i++) {
            if (num % i == 0) {
                maxNum = num / i;
                sum += i;
                sum += maxNum;
            }
            if (sum > num) {
                break;
            }
        }
        return sum == num;
    }
}
