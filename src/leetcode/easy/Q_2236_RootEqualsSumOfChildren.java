package leetcode.easy;



public class Q_2236_RootEqualsSumOfChildren {

    /**
     * You are given the root of a binary tree that consists of exactly 3 nodes: the root, its left child, and its right child.
     *
     * Return true if the value of the root is equal to the sum of the values of its two children, or false otherwise.
     * @param args
     */

    public static void main(String[] args) {

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean checkTree(TreeNode root) {

        if(root == null){
            return true;
        }

        if(root.left.val + root.right.val == root.val){
            return true;
        }else{
            return false;
        }

    }


}
