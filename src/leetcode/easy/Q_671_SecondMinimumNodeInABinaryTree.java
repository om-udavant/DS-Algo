package leetcode.easy;

public class Q_671_SecondMinimumNodeInABinaryTree {

    /*
     * Given a non-empty special binary tree consisting of nodes with the non-negative value,
     * where each node in this tree has exactly two or zero sub-node. If the node has two sub-nodes,
     * then this node's value is the smaller value among its two sub-nodes. More formally,
     * the property root.val = min(root.left.val, root.right.val) always holds.
     * Given such a binary tree, you need to output the second minimum value in the set made of all the nodes' value in the whole tree.
     * If no such second minimum value exists, output -1 instead.
     */

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

    public static void main(String[] args) {

    }

    int min1;
    long ans = Long.MAX_VALUE;

    public int findSecondMinimumValue(TreeNode root) {
        min1 = root.val;
        dfs(root);
        return ans < Long.MAX_VALUE ? (int) ans : -1;
    }

    public void dfs(TreeNode root) {
        if (root != null) {
            if (min1 < root.val && root.val < ans) {
                ans = root.val;
            } else if (min1 == root.val) {
                dfs(root.left);
                dfs(root.right);
            }
        }
    }
}
