package hackerrank.easy;

import java.util.ArrayList;
import java.util.Collections;

public class Q_041_CutTheSticks {

    /*
     * Complete the 'cutTheSticks' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(4);
        arr.add(4);
        arr.add(2);
        arr.add(2);
        arr.add(8);

        ArrayList<Integer> result = cutTheSticks(arr);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }

    private static ArrayList<Integer> cutTheSticks(ArrayList<Integer> arr) {

        ArrayList<Integer> sizes = new ArrayList<>();

        while (arr.size() != 0) {
            sizes.add(arr.size());
            int min = Collections.min(arr);
            arr.removeAll(Collections.singleton(min));
            for (int i = 0; i < arr.size(); i++) {
                arr.set(i, arr.get(i) - min);
            }
        }

        return sizes;
    }
}
