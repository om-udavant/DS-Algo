package leetcode.medium;

public class Q_0059_SpiralMatrixII {

    /*
     * Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
     *
     */

    public static void main(String[] args) {

    }

    public int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];

        if (n == 0) {
            return matrix;
        }

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int columnBegin = 0;
        int columnEnd = matrix[0].length - 1;
        int count = 1;
        while (rowBegin <= rowEnd && columnBegin <= columnEnd) {

            for (int i = columnBegin; i <= columnEnd; i++) {
                matrix[rowBegin][i] = count;
                count++;
            }

            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++) {
                matrix[i][columnEnd] = count;
                count++;
            }

            columnEnd--;

            if (rowBegin <= rowEnd) {
                for (int i = columnEnd; i >= columnBegin; i--) {
                    matrix[rowEnd][i] = count;
                    count++;
                }
            }

            rowEnd--;

            if (columnBegin <= columnEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    matrix[i][columnBegin] = count;
                    count++;
                }
            }

            columnBegin++;

        }

        return matrix;

    }
}
