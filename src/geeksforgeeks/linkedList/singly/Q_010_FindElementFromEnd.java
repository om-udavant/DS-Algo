package geeksforgeeks.linkedList.singly;

public class Q_010_FindElementFromEnd {

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

        Q_010_FindElementFromEnd llist = new Q_010_FindElementFromEnd();

        llist.push(9);
        llist.push(5);
        llist.push(2);
        llist.push(6);
        llist.push(8);
        llist.push(1);
        llist.push(3);
        llist.push(7);
        llist.push(10);
        llist.push(4);

        System.out.println("\nThe Given List is ");
        llist.printList();

        llist.printNthFromLast(5);
    }

    private void printNthFromLast(int index) {
        Node n = head;
        int length = 0;

        while (n != null){
            n = n.next;
            length ++;
        }

        if (length < index){
            System.out.println("\n\nGiven index is bigger then the Length of the List.");
            return;
        }

        n = head;

        for (int i = 0; i < length - index; i++){
            n = n.next;
        }
        System.out.println("\n\nElement at the Given Index " + index + " from END is " + n.data);
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
