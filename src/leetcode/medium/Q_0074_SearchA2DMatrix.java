package leetcode.medium;

public class Q_0074_SearchA2DMatrix {

    /*
     * You are given an m x n integer matrix matrix with the following two properties:
     * Each row is sorted in non-decreasing order.
     * The first integer of each row is greater than the last integer of the previous row.
     * Given an integer target, return true if target is in matrix or false otherwise.
     * You must write a solution in O(log(m * n)) time complexity.
     *
     */

    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0) {
            return false;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;

        int left = 0;
        int right = rows * columns - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midElement = matrix[mid / columns][mid % columns];
            if (midElement == target) {
                return true;
            } else if (target < midElement) {
                right = mid - 1;
            } else if (target > midElement) {
                left = mid + 1;
            }
        }

        return false;

    }
}
