package leetcode.easy;

public class Q_108_ConvertSortedArrayToBinarySearchTree {

    /*
     *
     * Given an integer array nums where the elements are sorted in ascending order,
     * convert it to a height-balanced binary search tree.
     * A height-balanced binary tree is a binary tree in which the depth of the two
     * subtrees of every node never differs by more than one.
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

    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums.length == 0) {
            return null;
        }

        return convertArray(nums, 0, nums.length - 1);

    }

    public TreeNode convertArray(int[] nums, int left, int right) {

        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = convertArray(nums, left, mid - 1);
        root.right = convertArray(nums, mid + 1, right);

        return root;
    }

}
