package geeksforgeeks.binaryTree.constructionConversion;

public class Q_002_ConstructTreeFromInorderLevelorder {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }

        public void left(Node left) {
            this.left = left;
        }

        public void right(Node right) {
            this.right = right;
        }
    }

    public static void main(String[] args) {
        int in[] = new int[]{4, 8, 10, 12, 14, 20, 22};
        int level[] = new int[]{20, 8, 22, 4, 12, 10, 14};
        int n = in.length;
        Node root = null;
        Node node = buildTree(root, level, in, 0, in.length - 1);

        System.out.print("Inorder traversal of the constructed tree is ");
        printInorder(node);
    }

    private static void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    private static Node buildTree(Node startNode, int[] levelOrder, int[] inOrder, int inStart, int inEnd) {

        if (inStart > inEnd) {
            return null;
        }

        if (inStart == inEnd) {
            return new Node(inOrder[inStart]);
        }

        boolean found = false;
        int index = 0;

        for (int i = 0; i < levelOrder.length - 1; i++) {
            int data = levelOrder[i];
            for (int j = inStart; j < inEnd; j++) {
                if (data == inOrder[j]) {
                    startNode = new Node(data);
                    index = j;
                    found = true;
                    break;
                }
            }
            if (found == true) {
                break;
            }
        }

        startNode.left(buildTree(startNode, levelOrder, inOrder, inStart, index - 1));
        startNode.right(buildTree(startNode, levelOrder, inOrder, index + 1, inEnd));

        return startNode;
    }


}
