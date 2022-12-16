package leetcode.medium;

import java.util.HashSet;

public class Q_0142_LinkedListCycleII {

    /*
     * Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
     * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
     * following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is
     * connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
     * Do not modify the linked list.
     *
     */

    public static void main(String[] args) {

    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        HashSet<ListNode> set = new HashSet<>();

        while (head.next != null) {
            if (set.contains(head)) {
                return head;
            }
            set.add(head);
            head = head.next;
        }

        return null;

    }
}
