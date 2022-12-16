package leetcode.easy;

public class Q_876_MiddleOfTheLinkedList {

    /*
     * Given the head of a singly linked list, return the middle node of the linked list.
     * If there are two middle nodes, return the second middle node.
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

    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast.next != null) {
            return slow.next;
        } else {
            return slow;
        }

    }
}
