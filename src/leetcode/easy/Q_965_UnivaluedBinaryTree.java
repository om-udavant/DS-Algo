package leetcode.easy;

import java.util.HashSet;

public class Q_965_UnivaluedBinaryTree {

    /*
     * A binary tree is uni-valued if every node in the tree has the same value.
     * Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.
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

    HashSet set = new HashSet<>();

    public boolean isUnivalTree(TreeNode root) {

        reverse(root);
        if (set.size() == 1) {
            return true;
        } else {
            return false;
        }
    }

    private void reverse(TreeNode root) {

        if (root != null) {
            set.add(root.val);
            reverse(root.left);
            reverse(root.right);
        }

    }
}
