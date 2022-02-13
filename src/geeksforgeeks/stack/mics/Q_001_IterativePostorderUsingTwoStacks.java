package geeksforgeeks.stack.mics;

import java.util.Stack;

//TODO revisit

public class Q_001_IterativePostorderUsingTwoStacks {

    static class Node{
        int data;
        Node left, right;

        Node(int d){
            data = d;
        }
    }

    public static void main(String[] args){

        Node root = null;
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        postOrderItretive(root);
    }

    private static void postOrderItretive(Node head) {

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        if (head == null){
            return;
        }

        s1.push(head);

        while (!s1.isEmpty()){

            Node tmp = s1.pop();
            s2.push(tmp);

            if (tmp.left != null){
                s1.push(tmp.left);
            }
            if (tmp.right != null){
                s1.push(tmp.right);
            }
        }

        while (!s2.isEmpty()){
            Node tmp = s2.pop();
            System.out.print(tmp.data + " ");
        }

    }
}
