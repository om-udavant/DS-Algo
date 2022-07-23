package hackerrank.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q_026_PickingNumbers {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * Given an array of integers, find the longest subarray where the a
     * bsolute difference between any two elements is less than or equal to 1.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(4);
        a.add(4);
        a.add(5);
        a.add(5);
        a.add(5);

        int result = pickingNumbers(a);

        System.out.println(result);

    }

    private static int pickingNumbers(List<Integer> a) {

        Collections.sort(a);

        int[] r = new int[a.size()];
        int b = 0;
        int count = 0;

        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                int check = Math.abs(a.get(i) - a.get(j));
                if (check <= 1) {
                    count++;
                }
            }

            r[b] = count;
            b++;
            count = 0;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < r.length; i++) {
            if (r[i] > max) {
                max = r[i];
            }
        }

        return (max + 1);

    }

}
