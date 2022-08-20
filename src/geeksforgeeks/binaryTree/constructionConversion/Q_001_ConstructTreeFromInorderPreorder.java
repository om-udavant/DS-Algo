package geeksforgeeks.binaryTree.constructionConversion;

public class Q_001_ConstructTreeFromInorderPreorder {

    static class Node {
        char data;
        Node left, right;

        Node(char item) {
            data = item;
            left = right = null;
        }
    }

    static int preIndex = 0;

    public static void main(String[] args) {

        char[] in = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
        char[] pre = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};
        int len = in.length;

        Node root = builtTree(in, pre, 0, len - 1);

        System.out.println("Inorder traversal of constructed tree is : ");
        printInorder(root);
    }

    private static void printInorder(Node root) {

        if (root == null)
            return;

        /* first recur on left child */
        printInorder(root.left);

        /* then print the data of node */
        System.out.print(root.data + " ");

        /* now recur on right child */
        printInorder(root.right);
    }

    private static Node builtTree(char[] in, char[] pre, int inStrt, int inEnd) {

        if (inStrt > inEnd) {
            return null;
        }

        Node tNode = new Node(pre[preIndex++]);

        if (inStrt == inEnd) {
            return tNode;
        }

        int inIndex = search(in, inStrt, inEnd, tNode.data);

        tNode.left = builtTree(in, pre, inStrt, inIndex - 1);
        tNode.right = builtTree(in, pre, inIndex + 1, inEnd);

        return tNode;
    }

    private static int search(char[] arr, int strt, int end, char value) {

        int i;
        for (i = strt; i < end; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return i;
    }
}
