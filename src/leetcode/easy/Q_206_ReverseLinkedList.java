package leetcode.easy;

public class Q_206_ReverseLinkedList {

    /*
     *
     * Given the head of a singly linked list, reverse the list, and return the reversed list.
     *
     * */

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

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {

            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }

        return prev;

    }

}
