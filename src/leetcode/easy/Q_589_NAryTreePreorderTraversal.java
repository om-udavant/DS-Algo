package leetcode.easy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Q_589_NAryTreePreorderTraversal {

    /*
     * Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
     * Nary-Tree input serialization is represented in their level order traversal. Each group of children
     * is separated by the null value.
     */

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public static void main(String[] args) {

    }

    public List<Integer> preorder(Node root) {

        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();

        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            output.add(node.val);
            Collections.reverse(node.children);
            for (Node child : node.children) {
                stack.add(child);
            }
        }

        return output;

    }
}
