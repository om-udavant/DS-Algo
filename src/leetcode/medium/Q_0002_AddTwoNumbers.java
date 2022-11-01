package leetcode.medium;

public class Q_0002_AddTwoNumbers {

    /*
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order, and each of their nodes contains a single digit.
     * Add the two numbers and return the sum as a linked list.
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;

        int carry = 0;
        while (l1 != null || l2 != null) {

            int l1Val = (l1 != null) ? l1.val : 0;
            int l2Val = (l2 != null) ? l2.val : 0;

            int currentSum = l1Val + l2Val + carry;
            carry = currentSum / 10;
            int lastDigit = currentSum % 10;

            ListNode newNode = new ListNode(lastDigit);
            l3.next = newNode;
            l3 = l3.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

        }

        if (carry > 0) {
            ListNode newNode = new ListNode(1);
            l3.next = newNode;
            l3 = l3.next;
        }

        return dummy.next;

    }
}
