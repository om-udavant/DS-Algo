package leetcode.easy;

public class Q_160_IntersectionOfTwoLinkedLists {

    /*
     *
     * Given the heads of two singly linked-lists headA and headB,
     * return the node at which the two lists intersect.
     * If the two linked lists have no intersection at all, return null.
     *
     * */

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int a = 0;
        int b = 0;

        for (ListNode n = headA; n != null; n = n.next) {
            a++;
        }

        for (ListNode n = headB; n != null; n = n.next) {
            b++;
        }

        int x = Math.abs(b - a);

        if (b > a) {
            for (int i = 0; i < x; i++) {
                headB = headB.next;
            }
        } else {
            for (int i = 0; i < x; i++) {
                headA = headA.next;
            }
        }

        while (headA != null || headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;

    }

}
