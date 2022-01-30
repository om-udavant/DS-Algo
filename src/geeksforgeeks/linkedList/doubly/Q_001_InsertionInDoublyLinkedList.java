package geeksforgeeks.linkedList.doubly;

public class Q_001_InsertionInDoublyLinkedList {

    static Node head;

    static class Node{
        int data;
        Node previous;
        Node next;
        Node(int d){
            data = d;
        }
    }

    public static void main(String[] args){

        Q_001_InsertionInDoublyLinkedList llist = new Q_001_InsertionInDoublyLinkedList();

        llist.push(8);
        llist.end(5);
        llist.end(1);
        llist.after(Q_001_InsertionInDoublyLinkedList.head.next.next, 3);
        llist.push(9);
        llist.before(Q_001_InsertionInDoublyLinkedList.head.next.next, 2);
        llist.end(4);
        llist.after(Q_001_InsertionInDoublyLinkedList.head.next.next, 6);

        System.out.println("The created Doubly Linked List is ");
        llist.printList();
    }

    private void printList() {

        Node start = head;
        Node last = null;

        System.out.println("\nTraversal in Forward Direction ");
        while (start != null){
            System.out.print(start.data + " ");
            last = start;
            start = start.next;
        }

        System.out.println("\nTraversal in Backward Direction ");
        while (last != null){
            System.out.print(last.data + " ");
            last = last.previous;
        }
    }

    private void before(Node nextNode, int newData) {

        if (nextNode == null){
            System.out.println("The given next node can not be Null.");
            return;
        }

        Node newNode = new Node(newData);

        newNode.previous = newNode.previous;

        nextNode.previous = newNode;

        newNode.next = nextNode;

        if (newNode.previous != null){
            newNode.previous.next = newNode;
        }else {
            head = newNode;
        }
    }

    private void after(Node prevNode, int newData) {

        if(prevNode == null){
            System.out.println("The given Previous node can not be Null.");
            return;
        }

        Node newNode = new Node(newData);

        newNode.next = prevNode.next;

        prevNode.next = newNode;

        newNode.previous = prevNode;

        if (newNode.next != null){
            newNode.next.previous = newNode;
        }
    }

    private void end(int newData) {

        Node newNode = new Node(newData);

        Node last = head;

        newNode.next = null;

        if(head == null){
            newNode.previous = null;
            head = newNode;
            return;
        }

        while (last.next != null){
            last = last.next;
        }

        last.next = newNode;

        newNode.previous = last;
    }

    private void push(int newData) {

        Node newNode = new Node(newData);

        newNode.next = head;
        newNode.previous = null;

        if (head != null){
            newNode.previous = newNode;
        }

        head = newNode;
    }

}
