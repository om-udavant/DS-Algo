package geeksforgeeks.linkedList.singly;

public class Q_004_DeletionInLinkedList {

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

        Q_004_DeletionInLinkedList llist = new Q_004_DeletionInLinkedList();

        llist.end(1);
        llist.end(2);
        llist.end(3);
        llist.end(4);
        llist.end(5);

        System.out.println("List before Deleting Element.");
        llist.printlist();

        llist.delete(3);
        System.out.println("\n\nList After Deleting the Element.");
        llist.printlist();
    }

    private void delete(int data) {

        Node temp = head, prev = null;

        if(temp == null){
            System.out.println("Element does not exist.");
            return;
        }

        if(temp != null && temp.data == data){
            head = temp.next;
            return;
        }

        while(temp != null && temp.data != data){
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
    }

    private void printlist() {

        Node n = head;
        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    private void end(int newData) {

        if(head == null){
            head = new Node(newData);
            return;
        }

        Node newNode = new Node(newData);

        newNode.next = null;

        Node last = head;
        while (last.next != null){
            last = last.next;
        }

        last.next = newNode;
        return;
    }
}
