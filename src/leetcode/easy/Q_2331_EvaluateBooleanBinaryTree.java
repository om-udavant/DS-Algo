package leetcode.easy;

public class Q_2331_EvaluateBooleanBinaryTree {

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

    public boolean evaluateTree(TreeNode root) {

        if(root.val == 0){
            return false;
        }

        if(root.val == 1){
            return true;
        }

        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);

        if(root.val == 2){
            return left || right;
        }

        return left && right;

    }
}
