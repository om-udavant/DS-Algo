package leetcode.medium;

public class Q_0061_RotateList {

    /*
     * Given the head of a linked list, rotate the list to the right by k places.
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

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null) {
            return head;
        }

        int len = 1;
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
            len++;
        }

        k = k % len;
        if (k == 0) {
            return head;
        }

        curr.next = head;
        ListNode newHead = head;
        for (int i = 0; i < len - k - 1; i++) {
            newHead = newHead.next;
        }

        ListNode temp = newHead.next;
        newHead.next = null;
        return temp;

    }
}
