package hackerrank.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_016_SubArrayDivision {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     *
     * Example
     * s = [2, 2, 1, 3, 2]
     * d = 4;
     * m = 2;
     *
     * Lily wants to find segments summing to Ron's birth day,d = 4 with a length equalling
     * his birth month m = 2 . In this case, there are two segments meeting her criteria: [2,2] and [1,3].
     */

    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();

        s.add(2);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);

        int d = 4, m = 2;

        int result = breakingRecords(s, d, m);

        System.out.println(result);
    }

    private static int breakingRecords(List<Integer> s, int d, int m) {
        int count = 0;

        for (int i = 0; i <= s.size() - m; i++) {
            int k = 0;

            for (int j = i; j < (m + i); j++) {
                k = k + s.get(j);
            }
            if (k == d) {
                count++;
            }

        }

        return count;
    }
}
