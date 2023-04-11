package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class Q_993_CousinsInBinaryTree {

    /*
     * Given the root of a binary tree with unique values and the values of two different nodes of the tree x and y, return true if the nodes corresponding to the values x and y in the tree are cousins, or false otherwise.
     * Two nodes of a binary tree are cousins if they have the same depth with different parents.
     * Note that in a binary tree, the root node is at the depth 0, and children of each depth k node are at the depth k + 1.
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

    public boolean isCousins(TreeNode root, int x, int y) {

        if (root == null) {
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean isXexist = false;
            boolean isYexist = false;

            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (cur.val == x) {
                    isXexist = true;
                }
                if (cur.val == y) {
                    isYexist = true;
                }
                if (cur.left != null && cur.right != null) {
                    if (cur.left.val == x && cur.right.val == y) {
                        return false;
                    }
                    if (cur.left.val == y && cur.right.val == x) {
                        return false;
                    }
                }
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            if (isXexist && isYexist) {
                return true;
            }
        }

        return false;

    }
}
