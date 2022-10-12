package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_144_BinaryTreePreorderTraversal {

    /*
     *
     * Given the root of a binary tree, return the preorder traversal of its nodes' values.
     *
     * */

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

    List<Integer> arr = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {

        helper(root);
        return arr;

    }

    public void helper(TreeNode root) {

        if (root == null) {
            return;
        }

        arr.add(root.val);
        helper(root.left);
        helper(root.right);

    }
}
