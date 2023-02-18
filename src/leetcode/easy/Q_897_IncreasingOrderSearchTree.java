package leetcode.easy;

public class Q_897_IncreasingOrderSearchTree {

    /*
     * Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node
     * in the tree is now the root of the tree, and every node has no left child and only one right child.
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

    TreeNode cur;

    public TreeNode increasingBST(TreeNode root) {

        TreeNode ans = new TreeNode(0);
        cur = ans;
        inOrder(root);
        return ans.right;

    }

    public void inOrder(TreeNode node) {

        if (node == null) {
            return;
        }

        inOrder(node.left);
        node.left = null;
        cur.right = node;
        cur = node;
        inOrder(node.right);

    }

}
