package hackerrank.easy;

public class Q_050_HalloweenSale {

    /*
     * Complete the 'howManyGames' function below.
     *
     * int p: the price of the first game
     * int d: the discount from the previous game price
     * int m: the minimum cost of a game
     * int s: the starting budget
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER d
     *  3. INTEGER m
     *  4. INTEGER s
     */

    public static void main(String[] args) {
        int p = 20;
        int d = 3;
        int m = 6;
        int s = 80;

        int result = howManyGames(p, d, m, s);
        System.out.println(result);
    }

    private static int howManyGames(int p, int d, int m, int s) {

        int cost = p;
        int total = 0;
        int count = 0;

        while (total <= s) {
            if (cost > m) {
                count++;
                total = total + cost;
                cost = cost - d;
            } else {
                count++;
                total = total + m;
            }
        }
        return count - 1;
    }
}
