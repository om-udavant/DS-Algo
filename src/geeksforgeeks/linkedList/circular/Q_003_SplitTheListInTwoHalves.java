package geeksforgeeks.linkedList.circular;

// Java program to delete a node from doubly linked list

public class Q_003_SplitTheListInTwoHalves {

    static Node head, tail, head1, head2;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
        }
    }

    public static void main(String[] args){

        Q_003_SplitTheListInTwoHalves llist = new Q_003_SplitTheListInTwoHalves();

        llist.push(10);
        llist.push(9);
        llist.push(8);
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.println("The given circular LinkedList is ");
        llist.printList(head);

        llist.splitList();

        System.out.println("\n\nFirst halves of the list ");
        llist.printList(head1);
        System.out.println("\nSecond halves of the list ");
        llist.printList(head2);

    }

    private void splitList() {
        Node slow = head;
        Node fast = head.next;

        while(fast != head && fast.next != head){
            slow = slow.next;
            fast = fast.next.next;
        }

        head1 = head;
        head2 = slow.next;

        slow.next = head1;

        Node current = head2;
        while (current.next != head){
            current = current.next;
        }
        current.next = head2;
    }

    private void printList(Node node) {
        Node temp = node;
        if (node != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != node);
        }
    }

    private void push(int newData) {

        Node newNode = new Node(newData);

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = newNode;
    }

}
