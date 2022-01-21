package geeksforgeeks.linkedList.singly;

// Java program to delete a linked list

public class Q_006_DeleteLinkedList {

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

        Q_006_DeleteLinkedList llist = new Q_006_DeleteLinkedList();

        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.println("\nThe Given LinkedList");
        llist.printList();

        System.out.println("\nDeleting linked list");

        llist.deleteList();

        System.out.println("Linked list deleted");

        llist.printList();
    }

    private void deleteList() {

        head = null;
    }

    private void printList() {

        Node n = head;
        while (n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    private void push(int newData) {

        Node newNode = new Node(newData);

        newNode.next = head;

        head = newNode;
    }
}
