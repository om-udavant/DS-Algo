package leetcode.easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q_559_MaximumDepthOfNaryTree {

    /*
     * Given a n-ary tree, find its maximum depth.
     * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     * Nary-Tree input serialization is represented in their level order traversal, each group of children
     * is separated by the null value (See examples).
     *
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

    ;

    public static void main(String[] args) {

    }

    public int maxDepth(Node root) {

        return dfs(root);

        /*  BFS
        if(root == null){
            return 0;
        }

        int depth = 0;

        Queue<Node> que = new LinkedList();
        que.offer(root);

        while(!que.isEmpty()){
            int size = que.size();

            for(int i = 0; i < size; i++){
                Node currentNode = que.poll();
                for(Node child : currentNode.children){
                    que.offer(child);
                }
            }

            depth++;
        }

        return depth++;
        */

    }

    public int dfs(Node root) {

        if (root == null) {
            return 0;
        }

        int count = 0;

        for (Node child : root.children) {
            count = Math.max(dfs(child), count);
        }

        return count + 1;
    }
}
