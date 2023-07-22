package leetcode.easy;

public class Q_1281_SubtractTheProductAndSumOfDigitsOfAnInteger {

    /*
     * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
     *
     */

    public static void main(String[] args) {

    }

    public int subtractProductAndSum(int n) {

        int product = 1;
        int sum = 0;

        while (n != 0) {
            int rem = n % 10;
            product *= rem;
            sum += rem;
            n /= 10;
        }

        return product - sum;

    }

}
