package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_501_FindModeInBinarySearchTree {

    /*
     *
     * Given the root of a binary search tree (BST) with duplicates, return all the mode(s) (i.e., the most frequently occurred element) in it.
     * If the tree has more than one mode, return them in any order.
     * Assume a BST is defined as follows:
     *   -The left subtree of a node contains only nodes with keys less than or equal to the node's key.
     *   -The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
     *   -Both the left and right subtrees must also be binary search trees.
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

    Integer prev = null;
    int count = 1;
    int max = 0;

    public int[] findMode(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        helper(root, list);

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;

    }

    public void helper(TreeNode root, List<Integer> list) {

        if (root == null) {
            return;
        }

        helper(root.left, list);

        if (prev != null) {

            if (prev == root.val) {
                count++;
            } else {
                count = 1;
            }

        }

        if (count > max) {
            max = count;
            list.clear();
            list.add(root.val);
        } else if (count == max) {
            list.add(root.val);
        }

        prev = root.val;

        helper(root.right, list);

    }
}
