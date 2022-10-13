package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_145_BinaryTreePostorderTraversal {

    /*
     *
     * Given the root of a binary tree, return the postorder traversal of its nodes' values.
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

    public List<Integer> postorderTraversal(TreeNode root) {

        if (root == null) {
            return arr;
        }

        helper(root);
        return arr;

    }

    public void helper(TreeNode root) {

        if (root == null) {
            return;
        }

        helper(root.left);
        helper(root.right);
        arr.add(root.val);
    }

}
