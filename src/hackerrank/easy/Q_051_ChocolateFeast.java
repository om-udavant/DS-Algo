package hackerrank.easy;

public class Q_051_ChocolateFeast {

    /*
     * Complete the 'chocolateFeast' function below.
     *
     * int n: Bobby's initial amount of money
     * int c: the cost of a chocolate bar
     * int m: the number of wrappers he can turn in for a free bar
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER c
     *  3. INTEGER m
     */

    public static void main(String[] args) {
        int n = 6;
        int c = 2;
        int m = 2;

        int result = chocolateFeast(n, c, m);
        System.out.println(result);
    }

    private static int chocolateFeast(int n, int c, int m) {

        int rap = n / c;
        int count = rap;
        while (rap >= m) {
            int rem = rap % m;
            rap = rap / m;
            count = count + rap;
            rap = rap + rem;
        }

        return count;
    }
}
