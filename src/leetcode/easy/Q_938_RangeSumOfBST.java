package leetcode.easy;

public class Q_938_RangeSumOfBST {

    /*
     * Given the root node of a binary search tree and two integers low and high,
     * return the sum of values of all nodes with a value in the inclusive range [low, high].
     *
     */

    public static void main(String[] args) {

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {

        traverseBST(root, low, high);
        return sum;

    }

    public void traverseBST(TreeNode root, int low, int high) {

        if (root == null) {
            return;
        }

        traverseBST(root.left, low, high);

        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }

        traverseBST(root.right, low, high);

    }
}
