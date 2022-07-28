package geeksforgeeks.binaryTree.introduction;

public class Q_012_FoldableBinaryTree {

    static class Node{
        int data;
        Node left, right;

        Node(int item){
            data = item;
            left = right = null;
        }

    }

    public static void main(String[] args){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.left.right = new Node(5);

        if (IsFoldable(root)){
            System.out.println("Tree is foldable");
        }
        else{
            System.out.println("Tree is not foldable");
        }
    }

    private static boolean IsFoldable(Node node) {

        if(node == null){
            return true;
        }

        return IsFoldableUtil(node.left, node.right);
    }

    private static boolean IsFoldableUtil(Node n1, Node n2) {

            if (n1 == null && n2 == null){
                return true;
            }

            if (n1 == null || n2 == null){
                return false;
            }

        return IsFoldableUtil(n1.left, n2.right) && IsFoldableUtil(n1.right, n2.left);
    }
}
