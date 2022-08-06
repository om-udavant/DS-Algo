package hackerrank.easy;

public class Q_029_UtopianTree {

    /*
     * Complete the 'utopianTree' function below.
     *
     * The Utopian Tree goes through 2 cycles of growth every year.
     * Each spring, it doubles in height. Each summer, its height increases by 1 meter.
     *
     * For example, if the number of growth cycles is n=5, the calculations are as follows:
     *  Period  Height
     *    0       1
     *    1       2
     *    2       3
     *    3       6
     *    4       7
     *    5       14
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static void main(String[] args) {

        int n = 5;

        int result = utopianTree(n);

        System.out.println(result);
    }

    private static int utopianTree(int n) {

        int value = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                value += 1;
            } else {
                value *= 2;
            }
        }
        return value;
    }
}
