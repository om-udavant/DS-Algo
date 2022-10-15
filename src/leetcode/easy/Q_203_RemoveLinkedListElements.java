package leetcode.easy;

public class Q_203_RemoveLinkedListElements {

    /*
     *
     * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has
     * Node.val == val, and return the new head.
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

    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return head;
        }

        if (head.next == null && head.val == val) {
            return head.next;
        }

        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;

    }
}
