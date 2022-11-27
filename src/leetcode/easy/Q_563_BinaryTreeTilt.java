package leetcode.easy;

public class Q_563_BinaryTreeTilt {

    /*
     * Given the root of a binary tree, return the sum of every tree node's tilt.
     * The tilt of a tree node is the absolute difference between the sum of all left subtree node
     * values and all right subtree node values. If a node does not have a left child,
     * then the sum of the left subtree node values is treated as 0. The rule is similar if the node does not have a right child.
     *
     */

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

    public static void main(String[] args) {

    }

    int totalTilt = 0;

    public int findTilt(TreeNode root) {

        valueSum(root);

        return totalTilt;

    }

    public int valueSum(TreeNode root){

        if(root == null){
            return 0;
        }

        int leftSum = valueSum(root.left);
        int rightSum = valueSum(root.right);
        int tilt = Math.abs(leftSum - rightSum);

        totalTilt += tilt;

        return root.val + leftSum + rightSum;
    }
}
