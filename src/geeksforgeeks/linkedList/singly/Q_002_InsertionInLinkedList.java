package geeksforgeeks.linkedList.singly;

import java.util.LinkedList;

public class Q_002_InsertionInLinkedList {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public static void main(String[] args){
        Q_002_InsertionInLinkedList llist = new Q_002_InsertionInLinkedList();

        llist.end(1);
        llist.front(2);
        llist.middle(llist.head.next, 3);
        llist.front(4);
        llist.end(5);
        llist.front(6);
        llist.middle(llist.head.next, 7);
        llist.end(8);
        llist.end(9);
        llist.front(10);
        llist.middle(llist.head.next, 11);
        llist.printList();
    }

    private void printList() {

        Node n = head;
        while (n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    private void middle(Node prevNode, int newData) {
        if(prevNode == null){
            System.out.println("The given node cannot be null");
            return;
        }

        Node newNode = new Node(newData);

        newNode.next = prevNode.next;

        prevNode.next = newNode;
    }

    private void front(int newData) {

        Node newNode = new Node(newData);

        newNode.next = head;

        head = newNode;
        return;
    }

    public void end(int newData){

        Node newNode = new Node(newData);

        if(head == null){
            head = new Node(newData);
            return;
        }

        newNode.next = null;

        Node last = head;

        while(last.next != null){
            last = last.next;
        }

        last.next = newNode;
        return;

    }
}
