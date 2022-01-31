package geeksforgeeks.linkedList.doubly;

public class Q_003_ReverseTheList {

    Node head;
    static class Node{
        int data;
        Node next;
        Node prevoius;
        Node(int d){
            data = d;
        }
    }
    public static void main(String[] args){

        Q_003_ReverseTheList llist = new Q_003_ReverseTheList();

        llist.push(8);
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.println("\nGiven Doubly Linked List is ");
        llist.printList();

        System.out.println("\nAfter Reversing the List");
        llist.reverseList();
        llist.printList();
    }

    private void reverseList() {
        Node last = null;
        Node start = head;

        while (start != null) {
            last = start.prevoius;
            start.prevoius = start.next;
            start.next = last;
            start = start.prevoius;
        }

        if (last != null) {
            head = last.prevoius;
        }
    }

    private void printList() {
        Node start = head;

        while (start != null){
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    private void push(int newData) {

        Node newNode = new Node(newData);

        newNode.prevoius = null;

        newNode.next = head;

        if (head != null){
            head.prevoius = newNode;
        }

        head = newNode;
    }
}
