package geeksforgeeks.linkedList.singly;

//Java program to delete a node in a
// linked list at a given position

public class Q_005_DeleteAtGivenPosition {

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

        Q_005_DeleteAtGivenPosition llist = new Q_005_DeleteAtGivenPosition();

        llist.front(6);
        llist.front(5);
        llist.front(4);
        llist.front(3);
        llist.front(2);
        llist.front(1);

        System.out.println("\nBefore Deleting ");
        llist.printlist();

        llist.delete(3);

        System.out.println("\nAfter Deleting at the Given Postion ");
        llist.printlist();
    }

    private void delete(int position) {

        if(head == null){
            System.out.println("List is Empty.");
            return;
        }

        Node temp = head;

        if(position == 0){
            head = temp.next;
            return;
        }

        for(int i = 0; i < position - 1; i++){
            temp = temp.next;
        }

        if(temp == null || temp.next == null){
            return;
        }

        Node next = temp.next.next;

        temp.next = next;
    }

    private void front(int newData) {

        Node newNode = new Node(newData);

        newNode.next = head;

        head = newNode;
    }

    private void printlist() {

        Node n = head;
        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

}
