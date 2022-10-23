package leetcode.easy;

public class Q_404_SumOfLeafLeaves {

    /*
     *
     * Given the root of a binary tree, return the sum of all left leaves.
     * A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.
     * */

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

    public int sumOfLeftLeaves(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int sum = 0;

        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            } else {
                sum += sumOfLeftLeaves(root.left);
            }
        }

        if (root.right != null) {
            if (root.right.left != null || root.right.right != null) {
                sum += sumOfLeftLeaves(root.right);
            }
        }

        return sum;
    }
}
