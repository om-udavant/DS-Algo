package leetcode.easy;

public class Q_783_MinimumDistanceBetweenBSTNodes {

    /*
     *
     * Given the root of a Binary Search Tree (BST),
     * return the minimum difference between the values of any two different nodes in the tree.
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

    int min = Integer.MAX_VALUE;
    Integer preValue = null;

    public int minDiffInBST(TreeNode root) {

        if (root == null) {
            return min;
        }

        minDiffInBST(root.left);

        if (preValue != null) {
            min = Math.min(min, root.val - preValue);
        }

        preValue = root.val;

        minDiffInBST(root.right);

        return min;
    }
}
