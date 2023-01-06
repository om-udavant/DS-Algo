package leetcode.medium;

public class Q_0116_PopulatingNextRightPointersInEachNode {

    /*
     * You are given a perfect binary tree where all leaves are on the same level,
     * and every parent has two children. The binary tree has the following definition:
     *
     * struct Node {
     * int val;
     * Node *left;
     * Node *right;
     * Node *next;
     * }
     */

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    ;

    public static void main(String[] args) {

    }

    public Node connect(Node root) {

        if (root == null || root.left == null || root.right == null) {
            return root;
        }

        root.left.next = root.right;

        if (root.next != null) {
            root.right.next = root.next.left;
        }

        connect(root.left);
        connect(root.right);

        return root;

    }
}
