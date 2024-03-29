package geeksforgeeks.binaryTree.traversal;

public class Q_004_PrintPostorderTraversalFromInorderPreorderTraversal {

    public static void main(String[] args) {
        int in[] = {4, 2, 5, 1, 3, 6};
        int pre[] = {1, 2, 4, 5, 3, 6};
        int len = in.length;

        printPost(in, pre, 0, len - 1);
    }

    static int preIndex = 0;

    private static void printPost(int[] in, int[] pre, int inStrt, int inEnd) {

        if (inStrt > inEnd) {
            return;
        }

        int inIndex = search(in, inStrt, inEnd, pre[preIndex++]);

        printPost(in, pre, inStrt, inIndex - 1);

        printPost(in, pre, inIndex + 1, inEnd);

        System.out.print(in[inIndex] + " ");
    }

    private static int search(int[] in, int startIn, int endIn, int data) {
        int i = 0;
        for (i = startIn; i < endIn; i++) {
            if (in[i] == data) {
                return i;
            }
        }
        return i;
    }
}
