package geeksforgeeks.linkedList.doubly;

public class Q_002_DeleteNodeInList {

    static Node head;
    static class Node{
        int data;
        Node next;
        Node previous;
        Node(int d){
            data = d;
        }
    }

    public static void main(String[] args){

        Q_002_DeleteNodeInList llist = new Q_002_DeleteNodeInList();

        llist.push(8);
        llist.push(9);
        llist.push(5);
        llist.push(6);
        llist.push(2);
        llist.push(4);
        llist.push(3);
        llist.push(1);

        System.out.println("\nGiven Doubly List is ");
        llist.printlist();

        llist.deleteNode(Q_002_DeleteNodeInList.head);
        System.out.println("\nList After deleting head node");
        llist.printlist();

        llist.deleteNode(Q_002_DeleteNodeInList.head.next.next.next);
        System.out.println("\nList After deleting middle node");
        llist.printlist();

        llist.deleteNode(Q_002_DeleteNodeInList.head.next.next.next.next.next);
        System.out.println("\nList After deleting last node");
        llist.printlist();
    }

    private void deleteNode(Node delete) {

        if (head == null || delete == null) {
            return;
        }

        if (head == delete) {
            head = delete.next;
        }

        if (delete.next != null) {
            delete.next.previous = delete.previous;
        }

        if (delete.previous != null) {
            delete.previous.next = delete.next;
        }
        return;
    }

    private void printlist() {

        Node start = head;
        Node last = null;
        while (start != null){
            System.out.print(start.data + " ");
            last = start;
            start = start.next;
        }
    }

    private void push(int newData) {

        Node newNode = new Node(newData);

        newNode.next = head;
        newNode.previous = null;

        if (head != null){
            head.previous = newNode;
        }

        head = newNode;
    }
}
