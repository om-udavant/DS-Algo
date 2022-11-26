package leetcode.easy;

public class Q_566_ReshapeTheMatrix {

    /*
     * In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different
     * size r x c keeping its original data.
     * You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns
     * of the wanted reshaped matrix.
     * The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
     * If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise,
     * output the original matrix.
     *
     */

    public static void main(String[] args) {

    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int count = 0;
        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = mat[count / n][count % n];
                count++;
            }
        }
        return arr;
    }
}
