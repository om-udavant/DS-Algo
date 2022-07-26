package geeksforgeeks.binaryTree.introduction;

public class Q_011_ContinuousTree {

    static class Node {
        int data;
        Node left, right;
    }

    public static void main(String[] args){

        Node root = newNode(3);

        root.left     = newNode(2);
        root.right     = newNode(4);
        root.left.left = newNode(1);
        root.left.right = newNode(3);
        root.right.right = newNode(5);
        
        if(treeContinuous(root)){
            System.out.println( "Yes") ;
        }
        else{
            System.out.println( "No");
        }

    }

    private static boolean treeContinuous(Node root) {

        if (root == null)
            return true;

        // if current node is leaf node then return true
        // because it is end of root to leaf path
        if (root.left == null && root.right == null){
            return true;
        }

        // If left subtree is empty, then only check right
        if (root.left == null){
            return (Math.abs(root.data - root.right.data) == 1) && treeContinuous(root.right);
        }

        // If right subtree is empty, then only check left
        if (root.right == null){
            return (Math.abs(root.data - root.left.data) == 1) && treeContinuous(root.left);
        }

        // If both left and right subtrees are not empty, check
        // everything
        return Math.abs(root.data - root.left.data)==1 && Math.abs(root.data - root.right.data)==1 && treeContinuous(root.left) && treeContinuous(root.right);

    }

    static Node newNode(int data)
    {
        Node node = new Node();
        node.data = data;
        node.left = node.right = null;
        return(node);
    }
}
