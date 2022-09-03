package hackerrank.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q_049_MinimumDistances {

    /*
     * Complete the 'minimumDistances' function below.
     *
     * The distance between two array values is the number of indices between them.
     * Given a, find the minimum distance between any pair of equal elements in the array.
     * If no such value exists, return -1.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */


    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(2);
        a.add(1);
        a.add(2);
        a.add(3);

        int result = minimumDistances(a);
        System.out.println(result);
    }

    private static int minimumDistances(List<Integer> a) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int j = 0;
        int max = Integer.MAX_VALUE;

        for (int i : a) {
            if (hm.containsKey(i)) {
                int perious = hm.get(i);
                max = Math.min(max, (j - perious));
            } else {
                hm.put(i, j);
            }
            j++;
        }
        if (max == Integer.MAX_VALUE) {
            return -1;
        } else {
            return max;
        }
    }
}
