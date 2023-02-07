package leetcode.easy;

public class Q_867_TransposeMatrix {

    /*
     * Given a 2D integer array matrix, return the transpose of matrix.
     * The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
     *
     */

    public static void main(String[] args) {

    }

    public int[][] transpose(int[][] matrix) {

        int[][] ans = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ans[j][i] = matrix[i][j];
            }
        }

        return ans;

    }
}
