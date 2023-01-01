package leetcode.medium;

public class Q_0019_RemoveNthNodeFromEndOfList {

    /*
     * Given the head of a linked list, remove the nth node from the end of the list and return its head.
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

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null || head.next == null) {
            return null;
        }

        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            temp = temp.next;
            count++;
        }

        if (n == count) {
            return head.next;
        }

        temp = head;

        for (int i = 0; i < count - n - 1; i++) {
            temp = temp.next;
        }

        if (n == 1) {
            temp.next = null;
        } else {
            temp.next = temp.next.next;
        }

        return head;

    }
}
