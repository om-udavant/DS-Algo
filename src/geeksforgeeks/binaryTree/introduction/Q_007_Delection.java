package geeksforgeeks.binaryTree.introduction;

import java.util.LinkedList;
import java.util.Queue;

public class Q_007_Delection {

    static class Node {

        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    static Node root;

    public static void main(String[] args) {

        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.left.right = new Node(12);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.println("Inorder traversal before deletion:");
        inorder(root);

        int key = 11;
        delete(root, key);

        System.out.println("\nInorder traversal after deletion:");
        inorder(root);
    }

    private static void delete(Node root, int key) {

        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            if (root.data == key) {
                root = null;
                return;
            } else {
                return;
            }
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        Node temp = null, keyNode = null;

        while (!q.isEmpty()) {

            temp = q.peek();
            q.remove();

            if (temp.data == key) {
                keyNode = temp;
            }
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }

        }
        if (keyNode != null) {
            int x = temp.data;
            deleteNode(root, temp);
            keyNode.data = x;
        }
    }

    private static void deleteNode(Node root, Node delNode) {

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        Node temp = null;

        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp == delNode) {
                temp = null;
                return;
            }
            if (temp.right != null) {
                if (temp.right == delNode) {
                    temp.right = null;
                    return;
                } else {
                    q.add(temp.right);
                }
            }
            if (temp.left != null) {
                if (temp.left == delNode) {
                    temp.left = null;
                    return;
                } else {
                    q.add(temp.left);
                }
            }

        }
    }

    private static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}
