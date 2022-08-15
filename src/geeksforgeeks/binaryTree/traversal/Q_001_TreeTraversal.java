package geeksforgeeks.binaryTree.traversal;

import com.sun.jdi.event.StepEvent;

public class Q_001_TreeTraversal {

    static class Node {
        int key;
        Node left, right;

        Node(int item) {
            key = item;
            left = right = null;
        }
    }

    //static Node root = null;

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("\nPreorder traversal of binary tree is ");
        printPreorder(root);

        System.out.println("\nInorder traversal of binary tree is ");
        printInorder(root);

        System.out.println("\nPostorder traversal of binary tree is ");
        printPostorder(root);

    }

    private static void printPostorder(Node root) {

        if (root == null)
            return;

        // first recur on left subtree
        printPostorder(root.left);

        // then recur on right subtree
        printPostorder(root.right);

        // now deal with the node
        System.out.print(root.key + " ");
    }

    private static void printInorder(Node root) {

        if (root == null)
            return;

        /* first recur on left child */
        printInorder(root.left);

        /* then print the data of node */
        System.out.print(root.key + " ");

        /* now recur on right child */
        printInorder(root.right);
    }

    private static void printPreorder(Node root) {

        if (root == null)
            return;

        /* first print data of node */
        System.out.print(root.key + " ");

        /* then recur on left subtree */
        printPreorder(root.left);

        /* now recur on right subtree */
        printPreorder(root.right);
    }
}
