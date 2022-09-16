package leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q_094_BinaryTreeInorderTraversal {

    /*
     *
     * Given the root of a binary tree, return the inorder traversal of its nodes' values.
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

    public List<Integer> inorderTraversal(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            ans.add(current.val);
            current = current.right;
        }

        return ans;

    }
}
