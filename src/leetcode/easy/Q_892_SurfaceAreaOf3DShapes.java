package leetcode.easy;

public class Q_892_SurfaceAreaOf3DShapes {

    /*
     *
     * You are given an n x n grid where you have placed some 1 x 1 x 1 cubes. Each value v = grid[i][j] represents a tower of
     * v cubes placed on top of cell (i, j).
     * After placing these cubes, you have decided to glue any directly adjacent cubes to each other,
     * forming several irregular 3D shapes.
     * Return the total surface area of the resulting shapes.
     * Note: The bottom face of each shape counts toward its surface area.
     *
     */

    public static void main(String[] args) {
        System.out.println();
    }

    public int surfaceArea(int[][] grid) {

        int sum = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                int h = grid[i][j];
                int fulls = h > 0 ? h * 4 + 2 : 0;

                if (cellExits(i, j - 1, grid)) {
                    if (h <= grid[i][j - 1]) {
                        fulls -= h;
                    } else {
                        fulls -= grid[i][j - 1];
                    }
                }

                if (cellExits(i - 1, j, grid)) {
                    if (h <= grid[i - 1][j]) {
                        fulls -= h;
                    } else {
                        fulls -= grid[i - 1][j];
                    }
                }

                if (cellExits(i, j + 1, grid)) {
                    if (h <= grid[i][j + 1]) {
                        fulls -= h;
                    } else {
                        fulls -= grid[i][j + 1];
                    }
                }

                if (cellExits(i + 1, j, grid)) {
                    if (h <= grid[i + 1][j]) {
                        fulls -= h;
                    } else {
                        fulls -= grid[i + 1][j];
                    }
                }

                sum += fulls;

            }
        }

        return sum;

    }

    private boolean cellExits(int row, int col, int[][] grid) {

        return (row <= grid.length - 1 && row >= 0) && (col <= grid[0].length - 1 && col >= 0);

    }
}
