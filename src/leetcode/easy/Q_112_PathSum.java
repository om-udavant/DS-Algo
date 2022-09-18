package leetcode.easy;

public class Q_112_PathSum {

    /*
     *
     * Given the root of a binary tree and an integer targetSum,
     * return true if the tree has a root-to-leaf path such that adding up all
     * the values along the path equals targetSum.
     * A leaf is a node with no children.
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

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return false;
        }

        /*

        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();

        nodeStack.add(root);
        sumStack.add(targetSum - root.val);

        while(!nodeStack.isEmpty()){

            TreeNode currentNode = nodeStack.pop();
            int currentSum = sumStack.pop();

            if(currentNode.left == null && currentNode.right == null && currentSum == 0){
                return true;
            }

            if(currentNode.left != null){
                nodeStack.add(currentNode.left);
                sumStack.add(currentSum - currentNode.left.val);
            }

            if(currentNode.right != null){
                nodeStack.add(currentNode.right);
                sumStack.add(currentSum - currentNode.right.val);
            }

        }

        return false;

        */

        return sumTest(root, targetSum, 0);

    }

    public boolean sumTest(TreeNode root, int targetSum, int sum) {

        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return (targetSum == (sum + root.val));
        }

        return (sumTest(root.left, targetSum, sum + root.val) || sumTest(root.right, targetSum, sum + root.val));

    }

}
