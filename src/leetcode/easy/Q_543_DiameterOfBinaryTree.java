package leetcode.easy;

public class Q_543_DiameterOfBinaryTree {

    /*
     *
     * Given the root of a binary tree, return the length of the diameter of the tree.
     * The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
     * This path may or may not pass through the root.
     * The length of a path between two nodes is represented by the number of edges between them.
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

    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int dl = diameterOfBinaryTree(root.left);
        int dr = diameterOfBinaryTree(root.right);
        int cur = height(root.left) + height(root.right);

        return Math.max(cur, Math.max(dl, dr));

    }

    public int height(TreeNode root) {

        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));

    }
}
