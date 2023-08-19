package leetcode.medium;

import java.util.LinkedList;
import java.util.List;

public class Q_0092_ReverseLinkedListII {

    /*
     * Given the head of a singly linked list and two integers left and right where left <= right,
     * reverse the nodes of the list from position left to position right, and return the reversed list.
     *
     */

    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        List<Integer> list = new LinkedList<>();
        goRecursively(head, list, left, right, 0);

        return head;
    }

    public void goRecursively(ListNode node, List<Integer> list, int left, int right, int cur) {
        if (node == null) {
            return;
        }

        cur++;

        if (cur >= left && cur <= right) {
            list.add(node.val);
        }

        if (cur > right) {
            return;
        }

        goRecursively(node.next, list, left, right, cur);
        if (cur >= left && cur <= right) {
            node.val = list.get(0);
            list.remove(0);
        }
    }
}
