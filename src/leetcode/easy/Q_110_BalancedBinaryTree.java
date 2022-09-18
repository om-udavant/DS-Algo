package leetcode.easy;

public class Q_110_BalancedBinaryTree {

    /*
     *
     * Given a binary tree, determine if it is height-balanced.
     * For this problem, a height-balanced binary tree is defined as:
     * a binary tree in which the left and right subtrees of every node
     * differ in height by no more than 1.
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

    public boolean isBalanced(TreeNode root) {

        /* TC :- O(n^2)
        if(root == null){
            return true;
        }

        if(Math.abs(height(root.left) - height(root.right)) > 1){
            return false;
        }

        return (isBalanced(root.left) && isBalanced(root.right));
        */

        if (root == null) {
            return true;
        }

        return (height(root) != -1);   // TC :- O(n)
    }

    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = height(node.left);
        int right = height(node.right);

        int bf = Math.abs(left - right);

        if (bf > 1 || left == -1 || right == -1) {
            return -1;
        }

        return (1 + Math.max(left, right));
    }

   /* public int height(TreeNode root){
        if(root == null){
            return 0;
        }

        return (1 + Math.max(height(root.left), height(root.right)));
    }
    */
}
