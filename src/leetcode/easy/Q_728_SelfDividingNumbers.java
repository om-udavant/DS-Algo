package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_728_SelfDividingNumbers {

    /*
     * A self-dividing number is a number that is divisible by every digit it contains.
     *   - For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
     * A self-dividing number is not allowed to contain the digit zero.
     * Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].
     *
     */

    public static void main(String[] args) {

    }

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = left; i <= right; i++) {

            if (isDividing(i)) {
                list.add(i);
            }

        }

        return list;

    }

    public static boolean isDividing(int n) {
        if (n <= 0) {
            return false;
        }

        int rem = 0;
        int temp = n;
        while (n != 0) {
            rem = n % 10;
            if (rem == 0 || temp % rem != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
