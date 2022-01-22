package geeksforgeeks.linkedList.singly;

// Java program to count number of nodes in a linked list

public class Q_007_LengthOfLinkedList {

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
        
        Q_007_LengthOfLinkedList llist = new Q_007_LengthOfLinkedList();
        
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.println("\nThe Given List is  ");
        llist.printList();

        llist.countList();
    }

    private void countList() {

        int count = 0;
        Node n = head;
        while (n != null){
            count++;
            n = n.next;
        }
        System.out.println("\n\nLength of the given LinkedList is  " + count);
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
