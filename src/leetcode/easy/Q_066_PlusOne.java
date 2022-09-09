package leetcode.easy;

public class Q_066_PlusOne {

    /*
     *
     * You are given a large integer represented as an integer array digits,
     * where each digits[i] is the ith digit of the integer.
     * The digits are ordered from most significant to least significant in left-to-right order.
     * The large integer does not contain any leading 0's.
     * Increment the large integer by one and return the resulting array of digits.
     *
     * */

    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {

        int len = digits.length;

        if (digits[len - 1] < 9) {
            digits[len - 1]++;
            return digits;
        }

        int car = 1;
        for (int i = len - 1; i >= 0; i--) {
            digits[i] = digits[i] + car;

            if (digits[i] == 10) {
                digits[i] = 0;
                car = 1;
            } else {
                car = 0;
            }
        }

        if (digits[0] == 0) {
            int[] arr = new int[len + 1];
            arr[0] = 1;
            return arr;
        }

        return digits;
    }
}
