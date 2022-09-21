package leetcode.easy;

import java.util.Arrays;
import java.util.List;

public class Q_119_PascalsTriangleII {

    /*
     *
     * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
     * In Pascal's triangle, each number is the sum of the two numbers directly above
     *
     * Example 1:
     * Input: rowIndex = 3
     * Output: [1,3,3,1]
     *
     * */

    public static void main(String[] args) {

    }

    public List<Integer> getRow(int rowIndex) {

        Integer[] arr = new Integer[rowIndex + 1];
        Arrays.fill(arr, 1);

        for (int i = 2; i <= rowIndex; i++) {
            for (int j = i - 1; j > 0; j--) {
                arr[j] = arr[j] + arr[j - 1];
            }
        }

        return Arrays.asList(arr);

    }

}
