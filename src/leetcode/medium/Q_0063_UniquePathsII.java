package leetcode.medium;

public class Q_0063_UniquePathsII {

    /*
     * You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., grid[0][0]).
     * The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
     * The robot can only move either down or right at any point in time.
     * An obstacle and space are marked as 1 or 0 respectively in grid.
     * A path that the robot takes cannot include any square that is an obstacle.
     * Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
     * The testcases are generated so that the answer will be less than or equal to 2 * 109.
     *
     */

    public static void main(String[] args) {

    }

    int[][] grid;
    Integer[][] cache;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        this.grid = obstacleGrid;

        int m = grid.length;
        int n = grid[0].length;
        if (grid[0][0] == 1 || grid[m - 1][n - 1] == 1) {
            return 0;
        }

        cache = new Integer[m][n];
        return helper(0, 0);

    }

    public int helper(int row, int col) {
        if (row >= grid.length || col >= grid[0].length) {
            return 0;
        }

        if (grid[row][col] == 1) {
            return 0;
        }

        if (row == grid.length - 1 && col == grid[0].length - 1) {
            return 1;
        }

        if (cache[row][col] != null) {
            return cache[row][col];
        }

        int down = helper(row + 1, col);
        int right = helper(row, col + 1);

        cache[row][col] = down + right;
        return cache[row][col];
    }
}
