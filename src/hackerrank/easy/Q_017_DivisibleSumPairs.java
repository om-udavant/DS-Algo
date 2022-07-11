package hackerrank.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_017_DivisibleSumPairs {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();

        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(6);

        int n = ar.size(), k = 5;

        int result = divisibleParis(ar, n, k);

        System.out.println(result);
    }

    private static int divisibleParis(List<Integer> ar, int n, int k) {
        int count = 0;

        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {
                int sum = 0;
                sum = ar.get(i) + ar.get(j);

                if (sum % k == 0) {
                    count++;
                }
            }

        }

        return count;
    }
}



