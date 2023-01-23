package leetcode.easy;

public class Q_700_SearchInABinarySearchTree {

    /*
     * You are given the root of a binary search tree (BST) and an integer val.
     * Find the node in the BST that the node's value equals val and return the subtree rooted with that node.
     * If such a node does not exist, return null.
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

    TreeNode temp = null;

    public TreeNode searchBST(TreeNode root, int val) {

        trav(root, val);

        return temp;
    }

    private void trav(TreeNode root, int val) {

        if (root == null) {
            return;
        }

        if (root.val == val) {
            temp = root;
            return;
        }

        trav(root.left, val);
        trav(root.right, val);

    }
}
