package leetcode.easy;

public class Q_104_MaximumDepthOfBinaryTree {

    /*
    *
    *Given the root of a binary tree, return its maximum depth.
    * A binary tree's maximum depth is the number of nodes along the longest
    * path from the root node down to the farthest leaf node.
    *
    * */

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

    public int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        int d = 1;
        d = d + Math.max(maxDepth(root.left), maxDepth(root.right));
        return d;

        /*
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
        */
    }

}
