package leetcode.easy;

public class Q_1351_CountNegativeNumbersInASortedMatrix {

    /*
     * Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise,
     * return the number of negative numbers in grid.
     *
     */

    public static void main(String[] args) {

    }

    public int countNegatives(int[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
