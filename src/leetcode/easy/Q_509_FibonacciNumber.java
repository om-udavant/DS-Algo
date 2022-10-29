package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Q_509_FibonacciNumber {

    /*
     * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
     * F(0) = 0, F(1) = 1
     * F(n) = F(n - 1) + F(n - 2), for n > 1.
     * Given n, calculate F(n).
     *
     */

    public static void main(String[] args) {

    }

    Map<Integer, Integer> map = new HashMap<>();

    public int fib(int n) {

        if (n < 2) {
            return n;
        }

        if (map.containsKey(n)) {
            return map.get(n);
        }

        int ans = fib(n - 1) + fib(n - 2);
        map.put(n, ans);

        return ans;

    }
}
