package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_872_LeafSimilarTrees {

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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> l1 = new ArrayList();
        List<Integer> l2 = new ArrayList();

        dfs(root1, l1);
        dfs(root2, l2);

        return l1.equals(l2);

    }

    public void dfs(TreeNode node, List<Integer> leaf) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                leaf.add(node.val);
            }
            dfs(node.left, leaf);
            dfs(node.right, leaf);
        }
    }
}
