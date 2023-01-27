package leetcode.easy;

import java.util.HashSet;

public class Q_653_TwoSumIVInputIsABST {

    /*
     * Given the root of a binary search tree and an integer k,
     * return true if there exist two elements in the BST such that their sum is equal to k,
     * or false otherwise.
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

    HashSet<Integer> a = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {

        return solve(root, k);

    }

    public boolean solve(TreeNode root, int k) {
        if (root == null) {
            return false;
        }

        if (solve(root.left, k)) {
            return true;
        }

        if (a.contains(k - root.val)) {
            return true;
        }

        a.add(root.val);

        return solve(root.right, k);
    }
}
