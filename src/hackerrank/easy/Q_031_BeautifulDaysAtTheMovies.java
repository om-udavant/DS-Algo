package hackerrank.easy;

public class Q_031_BeautifulDaysAtTheMovies {

    /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */

    public static void main(String[] args) {
        int i = 20;
        int j = 23;
        int k = 6;

        int result = beautifulDays(i, j, k);
        System.out.println(result);
    }

    private static int beautifulDays(int i, int j, int k) {

        int count = 0;
        for (int a = i; a <= j; a++) {
            int num = a;
            int rev = 0;
            while (num != 0) {
                int rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }

            int diff = Math.abs(a - rev);
            if (diff % k == 0) {
                count++;
            }
        }

        return count;
    }
}
