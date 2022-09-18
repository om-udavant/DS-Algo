package leetcode.easy;

public class Q_111_MinimumDepthOfBinaryTree {

    /*
     *
     * Given a binary tree, find its minimum depth.
     * The minimum depth is the number of nodes along the shortest
     * path from the root node down to the nearest leaf node.
     *
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

    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (left == 0 && right == 0) {
            return 1;
        } else if (left == 0) {
            return right + 1;
        } else if (right == 0) {
            return left + 1;
        }

        return Math.min(left, right) + 1;

    }

}
