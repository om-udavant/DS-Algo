package leetcode.medium;

import java.math.BigInteger;

public class Q_0043_MultiplyStrings {

    /*
     * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2,
     * also represented as a string.
     * Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
     *
     */

    public static void main(String[] args) {

    }

    public String multiply(String num1, String num2) {

        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);

        String ans = "" + n1.multiply(n2);

        return ans;

/*
        int n1 = 0;
        int n2 = 0;

        for(char c : num1.toCharArray()){
            n1 = n1 * 10 + ('0' - c);
        }

        for(char c : num2.toCharArray()){
            n2 = n2 * 10 + ('0' - c);
        }

        return Integer.toString(n1 * n2);
  */
    }
}
