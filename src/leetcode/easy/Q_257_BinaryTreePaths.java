package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_257_BinaryTreePaths {

    /*
     * Given the root of a binary tree, return all root-to-leaf paths in any order.
     * A leaf is a node with no children.
     * */

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

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> list = new ArrayList<String>();

        traversal(root, new StringBuilder(), list);

        return list;
    }

    public void traversal(TreeNode root, StringBuilder str, List<String> list) {

        if (root == null) {
            return;
        }
        int len = str.length();
        str.append(root.val);
        if (root.left == null && root.right == null) {
            list.add(str.toString());

        } else {
            str.append("->");
            traversal(root.left, str, list);
            traversal(root.right, str, list);
        }

        str.delete(len, str.length());

    }
}
