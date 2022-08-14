package hackerrank.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_034_CircularArrayRotation {

    /*
     * Complete the 'convertingArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     *  3. INTEGER_ARRAY queries
     */

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<Integer>();
        a.add(3);
        a.add(4);
        a.add(5);

        int k = 2;

        List<Integer> queries = new ArrayList<Integer>();
        queries.add(3);
        queries.add(4);
        queries.add(5);

        List<Integer> result = convertingArray(a, k, queries);

        for (int i = 0; i < queries.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    private static List<Integer> convertingArray(List<Integer> a, int k, List<Integer> queries) {
        List<Integer> ans = new ArrayList<Integer>();

        k = k % a.size();
        int l = a.size();
        for (int i = 0; i < queries.size(); i++) {
            int pos = (queries.get(i) - k + l) % l;
            ans.add(a.get(pos));
        }

        return ans;
    }

}
