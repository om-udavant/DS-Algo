package geeksforgeeks.binaryTree.introduction;

public class Q_010_AVLTreeWithDuplicate {

    // Java program of AVL tree that handles duplicates

    static class Node {
        int key;
        Node right;
        Node left;
        int height;
        int count;
    }

    public static void main(String[] args) {

        Node root = null;

        root = insert(root, 9);
        root = insert(root, 5);
        root = insert(root, 10);
        root = insert(root, 5);
        root = insert(root, 9);
        root = insert(root, 7);
        root = insert(root, 17);

        System.out.println("\nPre Order traversal of the contructed AVL tree is");
        preOrder(root);

        deleteNode(root, 9);

        System.out.println("\n\nPre Order traversal after delection of 9");
        preOrder(root);
    }

    static Node insert(Node node, int key) {
        if (node == null) {
            return (newNode(key));
        }

        if (key == node.key) {
            (node.count)++;
            return node;
        }

        if (key < node.key) {
            node.left = insert(node.left, key);
        } else {
            node.right = insert(node.right, key);
        }

        /*  Update height of this ancestor node */
        node.height = max(height(node.left), height(node.right)) + 1;

        /*  Get the balance factor of this ancestor node to check whether
       this node became unbalanced */
        int balance = getBalance(node);

        // If this node becomes unbalanced, then there are 4 cases

        // Left Left Case
        if (balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }

        // Right Right Case
        if (balance < -1 && key > node.right.key) {
            return leftRotate(node);
        }

        // Left Right Case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    static Node minValueNode(Node node) {
        Node current = node;

        while (current.left != null) {
            current = current.left;
        }

        return current;
    }

    static Node deleteNode(Node root, int key) {

        if (root == null) {
            return root;
        }

        // If the key to be deleted is smaller than the root's key,
        // then it lies in left subtree
        if (key < root.key) {
            root.left = deleteNode(root.left, key);
        }

        // If the key to be deleted is greater than the root's key,
        // then it lies in right subtree
        else if (key > root.key) {
            root.right = deleteNode(root.right, key);
        }

        // if key is same as root's key, then This is the node
        // to be deleted
        else {
            // If key is present more than once, simply decrement
            // count and return
            if (root.count > 1) {
                (root.count)--;
                return null;
            }
            // ElSE, delete the node

            // node with only one child or no child
            if ((root.left == null) || (root.right == null)) {
                Node temp = root.left != null ? root.left : root.right;

                // No child case
                if (temp == null) {
                    temp = root;
                    root = null;
                } else { // One child case
                    root = temp;
                } // Copy the contents of the non-empty child
            } else {
                // node with two children: Get the inorder successor (smallest
                // in the right subtree)
                Node temp = minValueNode(root.right);

                // Copy the inorder successor's data to this node and update the count
                root.key = temp.key;
                root.count = temp.count;
                temp.count = 1;

                // Delete the inorder successor
                root.right = deleteNode(root.right, temp.key);
            }
        }

        // If the tree had only one node then return
        if (root == null)
            return root;

        // STEP 2: UPDATE HEIGHT OF THE CURRENT NODE
        root.height = max(height(root.left), height(root.right)) + 1;

        // STEP 3: GET THE BALANCE FACTOR OF THIS NODE (to check whether
        // this node became unbalanced)
        int balance = getBalance(root);

        // If this node becomes unbalanced, then there are 4 cases

        // Left Left Case
        if (balance > 1 && getBalance(root.left) >= 0) {
            return rightRotate(root);
        }

        // Left Right Case
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Right Case
        if (balance < -1 && getBalance(root.right) <= 0) {
            return leftRotate(root);
        }

        // Right Left Case
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    static void preOrder(Node root) {
        if (root != null) {
            System.out.printf("%d(%d) ", root.key, root.count);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    static int height(Node N) {
        if (N == null) {
            return 0;
        }
        return N.height;
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static Node newNode(int key) {
        Node node = new Node();
        node.key = key;
        node.left = null;
        node.right = null;
        node.height = 1;
        node.count = 1;
        return (node);
    }

    static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    static int getBalance(Node N) {
        if (N == null) {
            return 0;
        }
        return height(N.left) - height(N.right);
    }

}
