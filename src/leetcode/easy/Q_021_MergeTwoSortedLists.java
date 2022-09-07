package leetcode.easy;

public class Q_021_MergeTwoSortedLists {

    /*
     *
     * You are given the heads of two sorted linked lists list1 and list2.
     * Merge the two lists in a one sorted list. The list should be made by
     * splicing together the nodes of the first two lists.Return the head of
     * the merged linked list.
     *
     */

    public static void main(String[] args) {

    }

    /**
     * Definition for singly-linked list.
     */
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

    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            ListNode templist = new ListNode(0);
            ListNode current = templist;

            while (list1 != null && list2 != null) {
                int val1 = list1.val;
                int val2 = list2.val;

                if (val1 <= val2) {
                    current.next = list1;
                    current = current.next;
                    list1 = list1.next;
                } else {
                    current.next = list2;
                    current = current.next;
                    list2 = list2.next;
                }
            }

            while (list1 != null) {
                current.next = list1;
                current = current.next;
                list1 = list1.next;
            }
            while (list2 != null) {
                current.next = list2;
                current = current.next;
                list2 = list2.next;
            }

            return templist.next;

        }
    }
}
