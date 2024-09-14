package leetcode.easy;

public class Q_1022_SumOfRootToLeafBinaryNumbers {

    /**
     *
     * You are given the root of a binary tree where each node has a value 0 or 1. Each root-to-leaf path represents a binary number starting with the most significant bit.
     *
     * For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.
     * For all leaves in the tree, consider the numbers represented by the path from the root to that leaf. Return the sum of these numbers.
     *
     * The test cases are generated so that the answer fits in a 32-bits integer.
     *
     * @param args
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

    int ans;
    public int sumRootToLeaf(TreeNode root) {
        help(root, 0);
        return ans;
    }

    public void help(TreeNode root, int sum){
        if(root == null){
            return;
        }

        sum = sum * 2 + root.val;

        help(root.left, sum);
        if(root.left == null && root.right == null){
            ans += sum;
        }
        help(root.right, sum);

        sum /= 2;

    }

}
