package hackerrank.easy;

import java.util.ArrayList;

public class Q_044_EqualizeTheArray {

    /*
     * Complete the 'equalizeArray' function below.
     *
     * Given an array of integers, determine the minimum number of
     * elements to delete to leave only elements of equal value.
     * Example:
     * arr = [1, 2, 2, 3]
     * Delete the 2 elements 1 and 3 leaving arr = [2, 2]. If both twos plus either
     * the 1 or the 3 are deleted, it takes 3 deletions to leave either [3] or [1].
     * The minimum number of deletions is 2.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(3);

        int result = equalizeArray(arr);
        System.out.print(result);
    }

    private static int equalizeArray(ArrayList<Integer> arr) {

        ArrayList<Integer> num = new ArrayList<>();

        int length = arr.size();
        int count = 0;
        int min = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
            if (count > min) {
                min = count;
            }
            count = 0;
        }

        return length - min;
    }
}
