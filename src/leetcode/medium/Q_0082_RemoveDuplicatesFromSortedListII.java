package leetcode.medium;

import java.util.HashMap;

public class Q_0082_RemoveDuplicatesFromSortedListII {

    /*
     * Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
     * leaving only distinct numbers from the original list. Return the linked list sorted as well.
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

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode dummy = new ListNode(0);

        ListNode prev = dummy;
        ListNode curr = head;
        while (curr != null) {
            if (map.containsKey(curr.val)) {
                map.put(curr.val, map.get(curr.val) + 1);
            } else {
                map.put(curr.val, 1);
            }
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            if (map.get(curr.val) == 1) {
                prev.next = curr;
                prev = curr;
            }

            curr = curr.next;
        }
        if (prev.next != null) {
            prev.next = null;
        }
        return dummy.next;
    }
}
