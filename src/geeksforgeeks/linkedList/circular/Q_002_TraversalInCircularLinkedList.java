package geeksforgeeks.linkedList.circular;

import geeksforgeeks.linkedList.singly.Q_010_FindElementFromEnd;

public class Q_002_TraversalInCircularLinkedList {

    Node head;
    Node tail;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
        }
    }

    public static void main(String[] args){

        Q_002_TraversalInCircularLinkedList llist = new Q_002_TraversalInCircularLinkedList();

        llist.insert(10);
        llist.insert(9);
        llist.insert(8);
        llist.insert(7);
        llist.insert(6);
        llist.insert(3);
        llist.insert(5);
        llist.insert(4);
        llist.insert(2);
        llist.insert(1);

        llist.printList();
    }

    private void printList() {
        Node n = head;
        do {
            System.out.print(n.data + " ");
            n = n.next;
        }while (n != head);
    }

    private void insert(int newData) {

        Node newNode = new Node(newData);

        if(head == null){
           head = newNode;
           tail = newNode;
            return;
        }
       tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }
}
