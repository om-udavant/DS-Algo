package geeksforgeeks.binaryTree.traversal;

public class Q_003_InorderTraversalWithoutStack {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        treversal(root);

    }

    private static void treversal(Node root) {

        Node current, previous;

        if (root == null) {
            return;
        }

        current = root;
        while (current != null) {
            if (current.left == null) {
                System.out.print(current.data + " ");
                current = current.right;
            } else {
                /* Find the inorder predecessor of current */
                previous = current.left;

                while (previous.right != null && previous.right != current) {
                    previous = previous.right;
                }

                /* Make current as right child of its * inorder predecessor */
                if (previous.right == null) {
                    previous.right = current;
                    current = current.left;
                }

                /* Revert the changes made in the 'if' part to restore the original tree i.e., fix
                   the right child of predecessor*/
                else {
                    previous.right = null;
                    System.out.print(current.data + " ");
                    current = current.right;
                } /* End of if condition pre->right == NULL*/
            }
        }
    }
}
