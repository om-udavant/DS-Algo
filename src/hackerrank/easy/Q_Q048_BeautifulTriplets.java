package hackerrank.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_Q048_BeautifulTriplets {

    /*
     * Complete the 'beautifulTriplets' function below.
     *
     * Given an increasing sequenc of integers and the value of d,
     * count the number of beautiful triplets in the sequence.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static void main(String[] args) {

        int d = 1;
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int result = beautifulTriplets(d, arr);
        System.out.println(result);
    }

    private static int beautifulTriplets(int d, List<Integer> arr) {

        int count = 0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if ((arr.get(j) - arr.get(i)) == d) {
                    for (int k = j + 1; k < arr.size(); k++) {
                        if ((arr.get(k) - arr.get(j)) == d) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }
}
