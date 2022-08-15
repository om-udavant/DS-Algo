package geeksforgeeks.binaryTree.traversal;

import java.util.Stack;

public class Q_002_InorderTraversalWithoutRecursion {

    static class Node {
        int key;
        Node left, right;

        Node(int item) {
            key = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        inorder(root);
    }

    private static void inorder(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> s = new Stack<>();
        Node curr = root;

        while (curr != null || s.size() > 0) {

            /* Reach the left most Node of the
            curr Node */
            while (curr != null) {
                 /* place pointer to a tree node on
                   the stack before traversing
                  the node's left subtree */
                s.push(curr);
                curr = curr.left;
            }

            /* Current must be NULL at this point */
            curr = s.pop();

            System.out.print(curr.key + " ");

            /* we have visited the node and its
               left subtree.  Now, it's right
               subtree's turn */
            curr = curr.right;
        }
    }
}
