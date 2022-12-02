package leetcode.easy;

public class Q_606_ConstructStringUsingBinaryTree {

    /*
     * Given the root of a binary tree, construct a string consisting of parenthesis and integers from a
     * binary tree with the preorder traversal way, and return it.
     * Omit all the empty parenthesis pairs that do not affect the one-to-one mapping relationship between
     * the string and the original binary tree.
     *
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

    public String tree2str(TreeNode root) {

        StringBuilder str = new StringBuilder();
        dfs(root, str);

        return str.toString();

    }

    public static void dfs(TreeNode root, StringBuilder str){

        if(root == null){
            return;
        }

        str.append(String.valueOf(root.val));

        if(root.left == null && root.right == null){
            return;
        }

        str.append('(');
        dfs(root.left, str);
        str.append(')');

        if(root.right != null){
            str.append('(');
            dfs(root.right, str);
            str.append(')');
        }

    }
}
