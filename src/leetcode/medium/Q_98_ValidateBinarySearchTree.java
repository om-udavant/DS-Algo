package leetcode.medium;

import java.util.Stack;

public class Q_98_ValidateBinarySearchTree {

    /**
     * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
     *
     * A valid BST is defined as follows:
     *
     * The left
     * subtree
     *  of a node contains only nodes with keys less than the node's key.
     * The right subtree of a node contains only nodes with keys greater than the node's key.
     * Both the left and right subtrees must also be binary search trees.
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

    public boolean isValidBST(TreeNode root) {

        if(root == null){
            return true;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;

        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if(pre != null && root.val <= pre.val){
                return false;
            }

            pre = root;
            root = root.right;
        }

        return true;

    }

}
