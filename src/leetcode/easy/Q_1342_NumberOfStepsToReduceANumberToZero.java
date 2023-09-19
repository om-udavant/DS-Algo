package leetcode.easy;

public class Q_1342_NumberOfStepsToReduceANumberToZero {

    /*
     * Given an integer num, return the number of steps to reduce it to zero.
     * In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
     *
     */

    public static void main(String[] args) {

    }

    public int numberOfSteps(int num) {

        int count = 0;

        while (num != 0) {
            if (num % 2 != 0) {
                num--;
                count++;
            } else {
                num /= 2;
                count++;
            }
        }

        return count;
    }

}
