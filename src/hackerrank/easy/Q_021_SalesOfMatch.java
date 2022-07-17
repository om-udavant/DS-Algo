package hackerrank.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q_021_SalesOfMatch {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * There is a large pile of socks that must be paired by color.
     * Given an array of integers representing the color of each sock,
     * determine how many pairs of socks with matching colors there are.
     *
     * Example
     * n = 7
     * ar = [1, 2, 1, 2, 1, 3, 2]
     *
     * There is one pair of color 1 and one of color 2.
     * There are three odd socks left, one of each color. The number of pairs is 2.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static void main(String[] args) {

        List<Integer> ar = new ArrayList<>();

        ar.add(10);
        ar.add(20);
        ar.add(20);
        ar.add(10);
        ar.add(10);
        ar.add(30);
        ar.add(50);
        ar.add(10);
        ar.add(20);

        int result = sockMerchant(ar, ar.size());

        System.out.println(result);
    }

    private static int sockMerchant(List<Integer> ar, int n) {
        int count = 1, pair = 0;

        Collections.sort(ar);

        for (int i = 0; i < n - 1; i++) {
            if (ar.get(i) == ar.get(i + 1)) {
                count++;
            } else {
                pair = pair + (count / 2);
                count = 1;
            }
            if (i == n - 2) {
                pair = pair + (count / 2);
            }
        }

        return pair;
    }
}
