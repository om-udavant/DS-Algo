package leetcode.medium;

import java.util.Stack;

public class Q_0098_ValidateBinarySearchTree {

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

    public static void main(String[] args) {

    }

    public boolean isValidBST(TreeNode root) {

        Stack<TreeNode> stack = new Stack();
        double leftNodeVal = -Double.MAX_VALUE;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if (root.val <= leftNodeVal) {
                return false;
            }

            leftNodeVal = root.val;
            root = root.right;

        }

        return true;

    }
}
