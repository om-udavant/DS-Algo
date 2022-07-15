package hackerrank.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_018_MigratoryBirds {

    /*
     * Complete the 'migratory' function below.
     *
     * Given an array of bird sightings where every element represents a bird type id,
     * determine the id of the most frequently sighted type. If more than 1 type has been
     * spotted that maximum amount, return the smallest of their ids.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);

        int result = migratory(arr);

        System.out.println(result);

    }

    private static int migratory(List<Integer> arr) {

        int ar[] = new int[5];
        int max = 0, ans = 0;

        for (int i = 0; i < arr.size(); i++) {
            ar[arr.get(i) - 1]++;
        }

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
                ans = i + 1;
            }
        }

        return ans;
    }
}
