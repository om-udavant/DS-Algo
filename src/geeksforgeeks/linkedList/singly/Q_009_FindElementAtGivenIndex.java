package geeksforgeeks.linkedList.singly;

// Java program to find n'th node in linked list

public class Q_009_FindElementAtGivenIndex {

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

        Q_009_FindElementAtGivenIndex llist = new Q_009_FindElementAtGivenIndex();

        llist.push(4);
        llist.push(6);
        llist.push(9);
        llist.push(7);
        llist.push(8);
        llist.push(4);
        llist.push(5);
        llist.push(2);

        System.out.println("\nThe Given List is ");
        llist.printList();

        llist.searchIndex(5);
    }

    private void searchIndex(int index) {

        Node current = head;
        int count = 0, y = 0;

        while (current != null){

            if (count == index){
                System.out.println("\n\nElement At Index " + index + " is " + current.data);
                y = 1;
                break;
            }else {
                count ++;
                current = current.next;
                y = 0;
            }
        }

        if (y == 0){
            System.out.println("\n\nElement At Index " + index + " is " + y);
        }
    }

    private void printList() {

        Node n = head;
        System.out.print("[ ");

        while (n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.print("]");

    }

    private void push(int newData) {

        Node newNode = new Node(newData);

        newNode.next = head;

        head = newNode;
    }

}
