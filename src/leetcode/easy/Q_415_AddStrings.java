package leetcode.easy;

public class Q_415_AddStrings {

    /*
     * Given two non-negative integers, num1 and num2 represented as string,
     * return the sum of num1 and num2 as a string.
     * You must solve the problem without using any built-in library for handling large integers (such as BigInteger).
     * You must also not convert the inputs to integers directly.
     */

    public static void main(String[] args) {

    }

    public String addStrings(String num1, String num2) {

        int n1 = num1.length() - 1;
        int n2 = num2.length() - 1;
        int sum = 0;

        StringBuilder str = new StringBuilder();

        while (n1 >= 0 || n2 >= 0 || sum > 0) {

            if (n1 >= 0) {
                sum += num1.charAt(n1) - '0';
                n1--;
            }
            if (n2 >= 0) {
                sum += num2.charAt(n2) - '0';
                n2--;
            }

            str.append(sum % 10);
            sum = sum / 10;
        }

        return str.reverse().toString();

    }
}
