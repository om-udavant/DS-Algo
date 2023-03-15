package leetcode.easy;

public class Q_944_DeleteColumnsToMakeSorted {

    /*
     * You are given an array of n strings strs, all of the same length.
     * The strings can be arranged such that there is one on each line, making a grid.
     *   - For example, strs = ["abc", "bce", "cae"] can be arranged as follows:
     *     abc
     *     bce
     *     cae
     * You want to delete the columns that are not sorted lexicographically.
     * In the above example (0-indexed), columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted,
     * while column 1 ('b', 'c', 'a') is not, so you would delete column 1.
     * Return the number of columns that you will delete.
     *
     */

    public static void main(String[] args) {

    }

    public int minDeletionSize(String[] strs) {
        int row = strs.length;
        int col = strs[0].length();
        int ans = 0;

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row - 1; j++) {
                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
