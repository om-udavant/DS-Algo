package geeksforgeeks.binaryTree.introduction;

import java.util.LinkedList;
import java.util.Queue;

public class Q_006_Insertion {

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
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.println("Inorder traversal before insertion: ");
        inOrder(root);

        int key = 12;
        insertion(root, key);

        System.out.println("\nInorder traversal after insertion: ");
        inOrder(root);
    }

    private static void insertion(Node root, int key) {

        Node temp = root;
        if (temp == null) {
            temp = new Node(key);
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while (!q.isEmpty()) {

            temp = q.peek();
            q.remove();

            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else {
                q.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else {
                q.add(temp.right);
            }
        }

    }

    private static void inOrder(Node root) {
        Node temp = root;
        if (temp == null) {
            return;
        }

        inOrder(temp.left);
        System.out.print(temp.data + " ");
        inOrder(temp.right);
    }
}
