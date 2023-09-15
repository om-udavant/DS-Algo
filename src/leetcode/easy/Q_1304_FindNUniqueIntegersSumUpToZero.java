package leetcode.easy;

public class Q_1304_FindNUniqueIntegersSumUpToZero {

    /*
     * Given an integer n, return any array containing n unique integers such that they add up to 0.
     *
     */

    public static void main(String[] args) {

    }

    public int[] sumZero(int n) {

        int[] ans = new int[n];
        if (n == 1) {
            ans[n - 1] = 0;
            return ans;
        }

        int temp = n;
        if (n % 2 != 0) {
            temp = n - 1;
            ans[n - 1] = 0;
        }

        for (int i = 0; i < temp; i += 2) {
            ans[i] = i + 1;
            ans[i + 1] = -(i + 1);
        }

        return ans;

    }
}
