package leetcode.easy;

public class Q_101_SymmetricTree {

    /*
     *
     * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
     *
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

    public boolean isSymmetric(TreeNode root) {

        return solve(root.left, root.right);

       /* Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);

        while (!stack.isEmpty()) {
            var left = stack.pop();
            var right = stack.pop();

            if (left == null || right == null) {
                if (left == right) {
                    continue;
                }
                return false;
            }
            if (left.val != right.val) {
                return false;
            }
            stack.push(left.left);
            stack.push(right.right);
            stack.push(left.right);
            stack.push(right.left);
        }

        return true;
        */

    }

    public boolean solve(TreeNode root1, TreeNode root2) {

        if ((root1 == null && root2 != null) || (root1 != null && root2 == null)) {
            return false;
        } else if (root1 == null && root2 == null) {
            return true;
        }

        if (root1.val != root2.val) {
            return false;
        }

        return (solve(root1.right, root2.left) && solve(root1.left, root2.right));

    }
}
