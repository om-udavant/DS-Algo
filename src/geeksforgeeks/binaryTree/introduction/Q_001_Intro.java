package geeksforgeeks.binaryTree.introduction;


public class Q_001_Intro {

    static class Node {
        int data;
        Node left, right;

        Node(int key) {
            data = key;
            left = right = null;
        }
    }

    Node root;

    Q_001_Intro(int key) {
        root = new Node(key);
    }

    Q_001_Intro() {
        root = null;
    }

    public static void main(String[] args) {

        Q_001_Intro tree = new Q_001_Intro();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
    }
}
